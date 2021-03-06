// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

@TestOn('chrome') // Uses web-only Flutter SDK

import 'dart:html' as html;
import 'package:flutter_test/flutter_test.dart';
import 'package:url_launcher_web/url_launcher_web.dart';
import 'package:mockito/mockito.dart';

import 'package:platform_detect/test_utils.dart' as platform;

class MockWindow extends Mock implements html.Window {}

void main() {
  group('$UrlLauncherPlugin', () {
    MockWindow mockWindow = MockWindow();
    UrlLauncherPlugin plugin = UrlLauncherPlugin(window: mockWindow);

    setUp(() {
      platform.configurePlatformForTesting(browser: platform.chrome);
    });

    group('canLaunch', () {
      test('"http" URLs -> true', () {
        expect(plugin.canLaunch('http://google.com'), completion(isTrue));
      });

      test('"https" URLs -> true', () {
        expect(plugin.canLaunch('https://google.com'), completion(isTrue));
      });

      test('"mailto" URLs -> true', () {
        expect(
            plugin.canLaunch('mailto:name@mydomain.com'), completion(isTrue));
      });

      test('"tel" URLs -> false', () {
        expect(plugin.canLaunch('tel:5551234567'), completion(isFalse));
      });
    });

    group('launch', () {
      setUp(() {
        // Simulate that window.open does something.
        when(mockWindow.open('https://www.google.com', ''))
            .thenReturn(MockWindow());
        when(mockWindow.open('mailto:name@mydomain.com', ''))
            .thenReturn(MockWindow());
      });

      test('launching a URL returns true', () {
        expect(
            plugin.launch(
              'https://www.google.com',
              useSafariVC: null,
              useWebView: null,
              universalLinksOnly: null,
              enableDomStorage: null,
              enableJavaScript: null,
              headers: null,
            ),
            completion(isTrue));
      });

      test('launching a "mailto" returns true', () {
        expect(
            plugin.launch(
              'mailto:name@mydomain.com',
              useSafariVC: null,
              useWebView: null,
              universalLinksOnly: null,
              enableDomStorage: null,
              enableJavaScript: null,
              headers: null,
            ),
            completion(isTrue));
      });
    });

    group('openNewWindow', () {
      test('http urls should be launched in a new window', () {
        plugin.openNewWindow('http://www.google.com');

        verify(mockWindow.open('http://www.google.com', ''));
      });

      test('https urls should be launched in a new window', () {
        plugin.openNewWindow('https://www.google.com');

        verify(mockWindow.open('https://www.google.com', ''));
      });

      test('mailto urls should be launched on a new window', () {
        plugin.openNewWindow('mailto:name@mydomain.com');

        verify(mockWindow.open('mailto:name@mydomain.com', ''));
      });

      group('Safari', () {
        setUp(() {
          platform.configurePlatformForTesting(browser: platform.safari);
        });

        test('http urls should be launched in a new window', () {
          plugin.openNewWindow('http://www.google.com');

          verify(mockWindow.open('http://www.google.com', ''));
        });

        test('https urls should be launched in a new window', () {
          plugin.openNewWindow('https://www.google.com');

          verify(mockWindow.open('https://www.google.com', ''));
        });

        test('mailto urls should be launched on the same window', () {
          plugin.openNewWindow('mailto:name@mydomain.com');

          verify(mockWindow.open('mailto:name@mydomain.com', '_top'));
        });
      });
    });
  });
}
