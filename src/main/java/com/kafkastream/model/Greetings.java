package com.kafkastream.model;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Greetings extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1529851463956734439L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Greetings\",\"namespace\":\"com.kafkastream.model\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"string\"},{\"name\":\"message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Greetings> ENCODER =
      new BinaryMessageEncoder<Greetings>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Greetings> DECODER =
      new BinaryMessageDecoder<Greetings>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Greetings> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Greetings> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Greetings>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Greetings to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Greetings from a ByteBuffer. */
  public static Greetings fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence timestamp;
  @Deprecated public java.lang.CharSequence message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Greetings() {}

  /**
   * All-args constructor.
   * @param timestamp The new value for timestamp
   * @param message The new value for message
   */
  public Greetings(java.lang.CharSequence timestamp, java.lang.CharSequence message) {
    this.timestamp = timestamp;
    this.message = message;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    case 1: return message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.lang.CharSequence)value$; break;
    case 1: message = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.CharSequence getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }

  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Creates a new Greetings RecordBuilder.
   * @return A new Greetings RecordBuilder
   */
  public static com.kafkastream.model.Greetings.Builder newBuilder() {
    return new com.kafkastream.model.Greetings.Builder();
  }

  /**
   * Creates a new Greetings RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Greetings RecordBuilder
   */
  public static com.kafkastream.model.Greetings.Builder newBuilder(com.kafkastream.model.Greetings.Builder other) {
    return new com.kafkastream.model.Greetings.Builder(other);
  }

  /**
   * Creates a new Greetings RecordBuilder by copying an existing Greetings instance.
   * @param other The existing instance to copy.
   * @return A new Greetings RecordBuilder
   */
  public static com.kafkastream.model.Greetings.Builder newBuilder(com.kafkastream.model.Greetings other) {
    return new com.kafkastream.model.Greetings.Builder(other);
  }

  /**
   * RecordBuilder for Greetings instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Greetings>
    implements org.apache.avro.data.RecordBuilder<Greetings> {

    private java.lang.CharSequence timestamp;
    private java.lang.CharSequence message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kafkastream.model.Greetings.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.message)) {
        this.message = data().deepCopy(fields()[1].schema(), other.message);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Greetings instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kafkastream.model.Greetings other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.message)) {
        this.message = data().deepCopy(fields()[1].schema(), other.message);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.kafkastream.model.Greetings.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.timestamp = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.kafkastream.model.Greetings.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }

    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public com.kafkastream.model.Greetings.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.message = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public com.kafkastream.model.Greetings.Builder clearMessage() {
      message = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Greetings build() {
      try {
        Greetings record = new Greetings();
        record.timestamp = fieldSetFlags()[0] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.message = fieldSetFlags()[1] ? this.message : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Greetings>
    WRITER$ = (org.apache.avro.io.DatumWriter<Greetings>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Greetings>
    READER$ = (org.apache.avro.io.DatumReader<Greetings>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
