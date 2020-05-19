// Autogenerated from Pigeon (v0.1.0-experimental.11), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.videoplayer;

import java.util.HashMap;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;

/** Generated class from Pigeon. */
public class Messages {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class TextureMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<String, Object>();
      toMapResult.put("textureId", textureId);
      return toMapResult;
    }
    static TextureMessage fromMap(HashMap map) {
      TextureMessage fromMapResult = new TextureMessage();
      fromMapResult.textureId = (map.get("textureId") instanceof Integer) ? (Integer)map.get("textureId") : (Long)map.get("textureId");
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class CreateMessage {
    private String asset;
    public String getAsset() { return asset; }
    public void setAsset(String setterArg) { this.asset = setterArg; }

    private String uri;
    public String getUri() { return uri; }
    public void setUri(String setterArg) { this.uri = setterArg; }

    private String packageName;
    public String getPackageName() { return packageName; }
    public void setPackageName(String setterArg) { this.packageName = setterArg; }

    private String formatHint;
    public String getFormatHint() { return formatHint; }
    public void setFormatHint(String setterArg) { this.formatHint = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<String, Object>();
      toMapResult.put("asset", asset);
      toMapResult.put("uri", uri);
      toMapResult.put("packageName", packageName);
      toMapResult.put("formatHint", formatHint);
      return toMapResult;
    }
    static CreateMessage fromMap(HashMap map) {
      CreateMessage fromMapResult = new CreateMessage();
      fromMapResult.asset = (String)map.get("asset");
      fromMapResult.uri = (String)map.get("uri");
      fromMapResult.packageName = (String)map.get("packageName");
      fromMapResult.formatHint = (String)map.get("formatHint");
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class LoopingMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Boolean isLooping;
    public Boolean getIsLooping() { return isLooping; }
    public void setIsLooping(Boolean setterArg) { this.isLooping = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<String, Object>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("isLooping", isLooping);
      return toMapResult;
    }
    static LoopingMessage fromMap(HashMap map) {
      LoopingMessage fromMapResult = new LoopingMessage();
      fromMapResult.textureId = (map.get("textureId") instanceof Integer) ? (Integer)map.get("textureId") : (Long)map.get("textureId");
      fromMapResult.isLooping = (Boolean)map.get("isLooping");
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class VolumeMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Double volume;
    public Double getVolume() { return volume; }
    public void setVolume(Double setterArg) { this.volume = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<String, Object>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("volume", volume);
      return toMapResult;
    }
    static VolumeMessage fromMap(HashMap map) {
      VolumeMessage fromMapResult = new VolumeMessage();
      fromMapResult.textureId = (map.get("textureId") instanceof Integer) ? (Integer)map.get("textureId") : (Long)map.get("textureId");
      fromMapResult.volume = (Double)map.get("volume");
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class PositionMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Long position;
    public Long getPosition() { return position; }
    public void setPosition(Long setterArg) { this.position = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<String, Object>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("position", position);
      return toMapResult;
    }
    static PositionMessage fromMap(HashMap map) {
      PositionMessage fromMapResult = new PositionMessage();
      fromMapResult.textureId = (map.get("textureId") instanceof Integer) ? (Integer)map.get("textureId") : (Long)map.get("textureId");
      fromMapResult.position = (map.get("position") instanceof Integer) ? (Integer)map.get("position") : (Long)map.get("position");
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class SpeedMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Double speed;
    public Double getSpeed() { return speed; }
    public void setSpeed(Double setterArg) { this.speed = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<String, Object>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("speed", speed);
      return toMapResult;
    }
    static SpeedMessage fromMap(HashMap map) {
      SpeedMessage fromMapResult = new SpeedMessage();
      fromMapResult.textureId = (map.get("textureId") instanceof Integer) ? (Integer)map.get("textureId") : (Long)map.get("textureId");
      fromMapResult.speed = (Double)map.get("speed");
      return fromMapResult;
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface VideoPlayerApi {
    void initialize();
    TextureMessage create(CreateMessage arg);
    void dispose(TextureMessage arg);
    void setLooping(LoopingMessage arg);
    void setVolume(VolumeMessage arg);
    void play(TextureMessage arg);
    PositionMessage position(TextureMessage arg);
    void seekTo(PositionMessage arg);
    void pause(TextureMessage arg);
    void setSpeed(SpeedMessage arg);

    /** Sets up an instance of `VideoPlayerApi` to handle messages through the `binaryMessenger` */
    public static void setup(BinaryMessenger binaryMessenger, VideoPlayerApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.initialize", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                api.initialize();
                wrapped.put("result", null);
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.create", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              CreateMessage input = CreateMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                TextureMessage output = api.create(input);
                wrapped.put("result", output.toMap());
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.dispose", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              TextureMessage input = TextureMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                api.dispose(input);
                wrapped.put("result", null);
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setLooping", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              LoopingMessage input = LoopingMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                api.setLooping(input);
                wrapped.put("result", null);
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setVolume", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              VolumeMessage input = VolumeMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                api.setVolume(input);
                wrapped.put("result", null);
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.play", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              TextureMessage input = TextureMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                api.play(input);
                wrapped.put("result", null);
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.position", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              TextureMessage input = TextureMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                PositionMessage output = api.position(input);
                wrapped.put("result", output.toMap());
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.seekTo", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              PositionMessage input = PositionMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                api.seekTo(input);
                wrapped.put("result", null);
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.pause", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              TextureMessage input = TextureMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                api.pause(input);
                wrapped.put("result", null);
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setSpeed", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object message, BasicMessageChannel.Reply<Object> reply) {
              SpeedMessage input = SpeedMessage.fromMap((HashMap)message);
              HashMap<String, HashMap> wrapped = new HashMap<String, HashMap>();
              try {
                api.setSpeed(input);
                wrapped.put("result", null);
              }
              catch (Exception exception) {
                wrapped.put("error", wrapError(exception));
              }
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static HashMap wrapError(Exception exception) {
    HashMap<String, Object> errorMap = new HashMap<String, Object>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", null);
    errorMap.put("details", null);
    return errorMap;
  }
}
