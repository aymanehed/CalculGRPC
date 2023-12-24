// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calcul.proto

package ma.ace.stubs;

public final class Calcul {
  private Calcul() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CalculateRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CalculateRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double number1 = 1;</code>
     * @return The number1.
     */
    double getNumber1();

    /**
     * <code>double number2 = 2;</code>
     * @return The number2.
     */
    double getNumber2();
  }
  /**
   * Protobuf type {@code CalculateRequest}
   */
  public  static final class CalculateRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CalculateRequest)
      CalculateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CalculateRequest.newBuilder() to construct.
    private CalculateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CalculateRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CalculateRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CalculateRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              number1_ = input.readDouble();
              break;
            }
            case 17: {

              number2_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.ace.stubs.Calcul.internal_static_CalculateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.ace.stubs.Calcul.internal_static_CalculateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.ace.stubs.Calcul.CalculateRequest.class, ma.ace.stubs.Calcul.CalculateRequest.Builder.class);
    }

    public static final int NUMBER1_FIELD_NUMBER = 1;
    private double number1_;
    /**
     * <code>double number1 = 1;</code>
     * @return The number1.
     */
    public double getNumber1() {
      return number1_;
    }

    public static final int NUMBER2_FIELD_NUMBER = 2;
    private double number2_;
    /**
     * <code>double number2 = 2;</code>
     * @return The number2.
     */
    public double getNumber2() {
      return number2_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (number1_ != 0D) {
        output.writeDouble(1, number1_);
      }
      if (number2_ != 0D) {
        output.writeDouble(2, number2_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (number1_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, number1_);
      }
      if (number2_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, number2_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ma.ace.stubs.Calcul.CalculateRequest)) {
        return super.equals(obj);
      }
      ma.ace.stubs.Calcul.CalculateRequest other = (ma.ace.stubs.Calcul.CalculateRequest) obj;

      if (java.lang.Double.doubleToLongBits(getNumber1())
          != java.lang.Double.doubleToLongBits(
              other.getNumber1())) return false;
      if (java.lang.Double.doubleToLongBits(getNumber2())
          != java.lang.Double.doubleToLongBits(
              other.getNumber2())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NUMBER1_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getNumber1()));
      hash = (37 * hash) + NUMBER2_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getNumber2()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ma.ace.stubs.Calcul.CalculateRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ma.ace.stubs.Calcul.CalculateRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CalculateRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CalculateRequest)
        ma.ace.stubs.Calcul.CalculateRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ma.ace.stubs.Calcul.internal_static_CalculateRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ma.ace.stubs.Calcul.internal_static_CalculateRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ma.ace.stubs.Calcul.CalculateRequest.class, ma.ace.stubs.Calcul.CalculateRequest.Builder.class);
      }

      // Construct using ma.ace.stubs.Calcul.CalculateRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        number1_ = 0D;

        number2_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ma.ace.stubs.Calcul.internal_static_CalculateRequest_descriptor;
      }

      @java.lang.Override
      public ma.ace.stubs.Calcul.CalculateRequest getDefaultInstanceForType() {
        return ma.ace.stubs.Calcul.CalculateRequest.getDefaultInstance();
      }

      @java.lang.Override
      public ma.ace.stubs.Calcul.CalculateRequest build() {
        ma.ace.stubs.Calcul.CalculateRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ma.ace.stubs.Calcul.CalculateRequest buildPartial() {
        ma.ace.stubs.Calcul.CalculateRequest result = new ma.ace.stubs.Calcul.CalculateRequest(this);
        result.number1_ = number1_;
        result.number2_ = number2_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ma.ace.stubs.Calcul.CalculateRequest) {
          return mergeFrom((ma.ace.stubs.Calcul.CalculateRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ma.ace.stubs.Calcul.CalculateRequest other) {
        if (other == ma.ace.stubs.Calcul.CalculateRequest.getDefaultInstance()) return this;
        if (other.getNumber1() != 0D) {
          setNumber1(other.getNumber1());
        }
        if (other.getNumber2() != 0D) {
          setNumber2(other.getNumber2());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ma.ace.stubs.Calcul.CalculateRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ma.ace.stubs.Calcul.CalculateRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double number1_ ;
      /**
       * <code>double number1 = 1;</code>
       * @return The number1.
       */
      public double getNumber1() {
        return number1_;
      }
      /**
       * <code>double number1 = 1;</code>
       * @param value The number1 to set.
       * @return This builder for chaining.
       */
      public Builder setNumber1(double value) {
        
        number1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double number1 = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNumber1() {
        
        number1_ = 0D;
        onChanged();
        return this;
      }

      private double number2_ ;
      /**
       * <code>double number2 = 2;</code>
       * @return The number2.
       */
      public double getNumber2() {
        return number2_;
      }
      /**
       * <code>double number2 = 2;</code>
       * @param value The number2 to set.
       * @return This builder for chaining.
       */
      public Builder setNumber2(double value) {
        
        number2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double number2 = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNumber2() {
        
        number2_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CalculateRequest)
    }

    // @@protoc_insertion_point(class_scope:CalculateRequest)
    private static final ma.ace.stubs.Calcul.CalculateRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ma.ace.stubs.Calcul.CalculateRequest();
    }

    public static ma.ace.stubs.Calcul.CalculateRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CalculateRequest>
        PARSER = new com.google.protobuf.AbstractParser<CalculateRequest>() {
      @java.lang.Override
      public CalculateRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CalculateRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CalculateRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CalculateRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ma.ace.stubs.Calcul.CalculateRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CalculateResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CalculateResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double result = 1;</code>
     * @return The result.
     */
    double getResult();
  }
  /**
   * Protobuf type {@code CalculateResponse}
   */
  public  static final class CalculateResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CalculateResponse)
      CalculateResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CalculateResponse.newBuilder() to construct.
    private CalculateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CalculateResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CalculateResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CalculateResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              result_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.ace.stubs.Calcul.internal_static_CalculateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.ace.stubs.Calcul.internal_static_CalculateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.ace.stubs.Calcul.CalculateResponse.class, ma.ace.stubs.Calcul.CalculateResponse.Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private double result_;
    /**
     * <code>double result = 1;</code>
     * @return The result.
     */
    public double getResult() {
      return result_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != 0D) {
        output.writeDouble(1, result_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, result_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ma.ace.stubs.Calcul.CalculateResponse)) {
        return super.equals(obj);
      }
      ma.ace.stubs.Calcul.CalculateResponse other = (ma.ace.stubs.Calcul.CalculateResponse) obj;

      if (java.lang.Double.doubleToLongBits(getResult())
          != java.lang.Double.doubleToLongBits(
              other.getResult())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getResult()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ma.ace.stubs.Calcul.CalculateResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ma.ace.stubs.Calcul.CalculateResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CalculateResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CalculateResponse)
        ma.ace.stubs.Calcul.CalculateResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ma.ace.stubs.Calcul.internal_static_CalculateResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ma.ace.stubs.Calcul.internal_static_CalculateResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ma.ace.stubs.Calcul.CalculateResponse.class, ma.ace.stubs.Calcul.CalculateResponse.Builder.class);
      }

      // Construct using ma.ace.stubs.Calcul.CalculateResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        result_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ma.ace.stubs.Calcul.internal_static_CalculateResponse_descriptor;
      }

      @java.lang.Override
      public ma.ace.stubs.Calcul.CalculateResponse getDefaultInstanceForType() {
        return ma.ace.stubs.Calcul.CalculateResponse.getDefaultInstance();
      }

      @java.lang.Override
      public ma.ace.stubs.Calcul.CalculateResponse build() {
        ma.ace.stubs.Calcul.CalculateResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ma.ace.stubs.Calcul.CalculateResponse buildPartial() {
        ma.ace.stubs.Calcul.CalculateResponse result = new ma.ace.stubs.Calcul.CalculateResponse(this);
        result.result_ = result_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ma.ace.stubs.Calcul.CalculateResponse) {
          return mergeFrom((ma.ace.stubs.Calcul.CalculateResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ma.ace.stubs.Calcul.CalculateResponse other) {
        if (other == ma.ace.stubs.Calcul.CalculateResponse.getDefaultInstance()) return this;
        if (other.getResult() != 0D) {
          setResult(other.getResult());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ma.ace.stubs.Calcul.CalculateResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ma.ace.stubs.Calcul.CalculateResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double result_ ;
      /**
       * <code>double result = 1;</code>
       * @return The result.
       */
      public double getResult() {
        return result_;
      }
      /**
       * <code>double result = 1;</code>
       * @param value The result to set.
       * @return This builder for chaining.
       */
      public Builder setResult(double value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double result = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearResult() {
        
        result_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CalculateResponse)
    }

    // @@protoc_insertion_point(class_scope:CalculateResponse)
    private static final ma.ace.stubs.Calcul.CalculateResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ma.ace.stubs.Calcul.CalculateResponse();
    }

    public static ma.ace.stubs.Calcul.CalculateResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CalculateResponse>
        PARSER = new com.google.protobuf.AbstractParser<CalculateResponse>() {
      @java.lang.Override
      public CalculateResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CalculateResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CalculateResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CalculateResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ma.ace.stubs.Calcul.CalculateResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculateRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculateRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculateResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014calcul.proto\"4\n\020CalculateRequest\022\017\n\007nu" +
      "mber1\030\001 \001(\001\022\017\n\007number2\030\002 \001(\001\"#\n\021Calculat" +
      "eResponse\022\016\n\006result\030\001 \001(\0012\340\001\n\021Calculator" +
      "Service\022.\n\003add\022\021.CalculateRequest\032\022.Calc" +
      "ulateResponse0\001\0225\n\010subtract\022\021.CalculateR" +
      "equest\032\022.CalculateResponse(\0010\001\0223\n\010multip" +
      "ly\022\021.CalculateRequest\032\022.CalculateRespons" +
      "e(\001\022/\n\006divide\022\021.CalculateRequest\032\022.Calcu" +
      "lateResponseB\016\n\014ma.ace.stubsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CalculateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CalculateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculateRequest_descriptor,
        new java.lang.String[] { "Number1", "Number2", });
    internal_static_CalculateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CalculateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculateResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
