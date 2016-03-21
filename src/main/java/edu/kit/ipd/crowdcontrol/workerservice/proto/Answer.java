// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: answer.proto

package edu.kit.ipd.crowdcontrol.workerservice.proto;

/**
 * Protobuf type {@code crowdcontrol.Answer}
 */
public  final class Answer extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:crowdcontrol.Answer)
    AnswerOrBuilder {
  // Use Answer.newBuilder() to construct.
  private Answer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Answer() {
    answer_ = "";
    experiment_ = 0;
    reservation_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Answer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            answer_ = s;
            break;
          }
          case 16: {

            experiment_ = input.readInt32();
            break;
          }
          case 24: {

            reservation_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.kit.ipd.crowdcontrol.workerservice.proto.AnswerOuterClass.internal_static_crowdcontrol_Answer_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.kit.ipd.crowdcontrol.workerservice.proto.AnswerOuterClass.internal_static_crowdcontrol_Answer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.kit.ipd.crowdcontrol.workerservice.proto.Answer.class, edu.kit.ipd.crowdcontrol.workerservice.proto.Answer.Builder.class);
  }

  public static final int ANSWER_FIELD_NUMBER = 1;
  private volatile java.lang.Object answer_;
  /**
   * <code>optional string answer = 1;</code>
   */
  public java.lang.String getAnswer() {
    java.lang.Object ref = answer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      answer_ = s;
      return s;
    }
  }
  /**
   * <code>optional string answer = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAnswerBytes() {
    java.lang.Object ref = answer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      answer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPERIMENT_FIELD_NUMBER = 2;
  private int experiment_;
  /**
   * <code>optional int32 experiment = 2;</code>
   */
  public int getExperiment() {
    return experiment_;
  }

  public static final int RESERVATION_FIELD_NUMBER = 3;
  private int reservation_;
  /**
   * <code>optional int32 reservation = 3;</code>
   */
  public int getReservation() {
    return reservation_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAnswerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, answer_);
    }
    if (experiment_ != 0) {
      output.writeInt32(2, experiment_);
    }
    if (reservation_ != 0) {
      output.writeInt32(3, reservation_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAnswerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, answer_);
    }
    if (experiment_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, experiment_);
    }
    if (reservation_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, reservation_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(edu.kit.ipd.crowdcontrol.workerservice.proto.Answer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code crowdcontrol.Answer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crowdcontrol.Answer)
      edu.kit.ipd.crowdcontrol.workerservice.proto.AnswerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.kit.ipd.crowdcontrol.workerservice.proto.AnswerOuterClass.internal_static_crowdcontrol_Answer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.kit.ipd.crowdcontrol.workerservice.proto.AnswerOuterClass.internal_static_crowdcontrol_Answer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.kit.ipd.crowdcontrol.workerservice.proto.Answer.class, edu.kit.ipd.crowdcontrol.workerservice.proto.Answer.Builder.class);
    }

    // Construct using edu.kit.ipd.crowdcontrol.workerservice.proto.Answer.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      answer_ = "";

      experiment_ = 0;

      reservation_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.kit.ipd.crowdcontrol.workerservice.proto.AnswerOuterClass.internal_static_crowdcontrol_Answer_descriptor;
    }

    public edu.kit.ipd.crowdcontrol.workerservice.proto.Answer getDefaultInstanceForType() {
      return edu.kit.ipd.crowdcontrol.workerservice.proto.Answer.getDefaultInstance();
    }

    public edu.kit.ipd.crowdcontrol.workerservice.proto.Answer build() {
      edu.kit.ipd.crowdcontrol.workerservice.proto.Answer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public edu.kit.ipd.crowdcontrol.workerservice.proto.Answer buildPartial() {
      edu.kit.ipd.crowdcontrol.workerservice.proto.Answer result = new edu.kit.ipd.crowdcontrol.workerservice.proto.Answer(this);
      result.answer_ = answer_;
      result.experiment_ = experiment_;
      result.reservation_ = reservation_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof edu.kit.ipd.crowdcontrol.workerservice.proto.Answer) {
        return mergeFrom((edu.kit.ipd.crowdcontrol.workerservice.proto.Answer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.kit.ipd.crowdcontrol.workerservice.proto.Answer other) {
      if (other == edu.kit.ipd.crowdcontrol.workerservice.proto.Answer.getDefaultInstance()) return this;
      if (!other.getAnswer().isEmpty()) {
        answer_ = other.answer_;
        onChanged();
      }
      if (other.getExperiment() != 0) {
        setExperiment(other.getExperiment());
      }
      if (other.getReservation() != 0) {
        setReservation(other.getReservation());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      edu.kit.ipd.crowdcontrol.workerservice.proto.Answer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (edu.kit.ipd.crowdcontrol.workerservice.proto.Answer) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object answer_ = "";
    /**
     * <code>optional string answer = 1;</code>
     */
    public java.lang.String getAnswer() {
      java.lang.Object ref = answer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        answer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string answer = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAnswerBytes() {
      java.lang.Object ref = answer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        answer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string answer = 1;</code>
     */
    public Builder setAnswer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      answer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string answer = 1;</code>
     */
    public Builder clearAnswer() {
      
      answer_ = getDefaultInstance().getAnswer();
      onChanged();
      return this;
    }
    /**
     * <code>optional string answer = 1;</code>
     */
    public Builder setAnswerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      answer_ = value;
      onChanged();
      return this;
    }

    private int experiment_ ;
    /**
     * <code>optional int32 experiment = 2;</code>
     */
    public int getExperiment() {
      return experiment_;
    }
    /**
     * <code>optional int32 experiment = 2;</code>
     */
    public Builder setExperiment(int value) {
      
      experiment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 experiment = 2;</code>
     */
    public Builder clearExperiment() {
      
      experiment_ = 0;
      onChanged();
      return this;
    }

    private int reservation_ ;
    /**
     * <code>optional int32 reservation = 3;</code>
     */
    public int getReservation() {
      return reservation_;
    }
    /**
     * <code>optional int32 reservation = 3;</code>
     */
    public Builder setReservation(int value) {
      
      reservation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 reservation = 3;</code>
     */
    public Builder clearReservation() {
      
      reservation_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:crowdcontrol.Answer)
  }

  // @@protoc_insertion_point(class_scope:crowdcontrol.Answer)
  private static final edu.kit.ipd.crowdcontrol.workerservice.proto.Answer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.kit.ipd.crowdcontrol.workerservice.proto.Answer();
  }

  public static edu.kit.ipd.crowdcontrol.workerservice.proto.Answer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Answer>
      PARSER = new com.google.protobuf.AbstractParser<Answer>() {
    public Answer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Answer(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Answer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Answer> getParserForType() {
    return PARSER;
  }

  public edu.kit.ipd.crowdcontrol.workerservice.proto.Answer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

