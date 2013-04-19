/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Status extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Status\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"requestToken\",\"type\":[\"string\",\"null\"]},{\"name\":\"statusCode\",\"type\":[\"int\",\"null\"]},{\"name\":\"statusMessage\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   public java.lang.CharSequence requestToken;
   public java.lang.Integer statusCode;
   public java.lang.CharSequence statusMessage;

  /**
   * Default constructor.
   */
  public Status() {}

  /**
   * All-args constructor.
   */
  public Status(java.lang.CharSequence requestToken, java.lang.Integer statusCode, java.lang.CharSequence statusMessage) {
    this.requestToken = requestToken;
    this.statusCode = statusCode;
    this.statusMessage = statusMessage;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestToken;
    case 1: return statusCode;
    case 2: return statusMessage;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestToken = (java.lang.CharSequence)value$; break;
    case 1: statusCode = (java.lang.Integer)value$; break;
    case 2: statusMessage = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'requestToken' field.
   */
  public java.lang.CharSequence getRequestToken() {
    return requestToken;
  }

  /**
   * Sets the value of the 'requestToken' field.
   * @param value the value to set.
   */
  public void setRequestToken(java.lang.CharSequence value) {
    this.requestToken = value;
  }

  /**
   * Gets the value of the 'statusCode' field.
   */
  public java.lang.Integer getStatusCode() {
    return statusCode;
  }

  /**
   * Sets the value of the 'statusCode' field.
   * @param value the value to set.
   */
  public void setStatusCode(java.lang.Integer value) {
    this.statusCode = value;
  }

  /**
   * Gets the value of the 'statusMessage' field.
   */
  public java.lang.CharSequence getStatusMessage() {
    return statusMessage;
  }

  /**
   * Sets the value of the 'statusMessage' field.
   * @param value the value to set.
   */
  public void setStatusMessage(java.lang.CharSequence value) {
    this.statusMessage = value;
  }

  /** Creates a new Status RecordBuilder */
  public static org.openrtb.common.api.Status.Builder newBuilder() {
    return new org.openrtb.common.api.Status.Builder();
  }
  
  /** Creates a new Status RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.Status.Builder newBuilder(org.openrtb.common.api.Status.Builder other) {
    return new org.openrtb.common.api.Status.Builder(other);
  }
  
  /** Creates a new Status RecordBuilder by copying an existing Status instance */
  public static org.openrtb.common.api.Status.Builder newBuilder(org.openrtb.common.api.Status other) {
    return new org.openrtb.common.api.Status.Builder(other);
  }
  
  /**
   * RecordBuilder for Status instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Status>
    implements org.apache.avro.data.RecordBuilder<Status> {

    private java.lang.CharSequence requestToken;
    private java.lang.Integer statusCode;
    private java.lang.CharSequence statusMessage;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.Status.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.Status.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Status instance */
    private Builder(org.openrtb.common.api.Status other) {
            super(org.openrtb.common.api.Status.SCHEMA$);
      if (isValidValue(fields()[0], other.requestToken)) {
        this.requestToken = data().deepCopy(fields()[0].schema(), other.requestToken);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.statusCode)) {
        this.statusCode = data().deepCopy(fields()[1].schema(), other.statusCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.statusMessage)) {
        this.statusMessage = data().deepCopy(fields()[2].schema(), other.statusMessage);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'requestToken' field */
    public java.lang.CharSequence getRequestToken() {
      return requestToken;
    }
    
    /** Sets the value of the 'requestToken' field */
    public org.openrtb.common.api.Status.Builder setRequestToken(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.requestToken = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'requestToken' field has been set */
    public boolean hasRequestToken() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'requestToken' field */
    public org.openrtb.common.api.Status.Builder clearRequestToken() {
      requestToken = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'statusCode' field */
    public java.lang.Integer getStatusCode() {
      return statusCode;
    }
    
    /** Sets the value of the 'statusCode' field */
    public org.openrtb.common.api.Status.Builder setStatusCode(java.lang.Integer value) {
      validate(fields()[1], value);
      this.statusCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'statusCode' field has been set */
    public boolean hasStatusCode() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'statusCode' field */
    public org.openrtb.common.api.Status.Builder clearStatusCode() {
      statusCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'statusMessage' field */
    public java.lang.CharSequence getStatusMessage() {
      return statusMessage;
    }
    
    /** Sets the value of the 'statusMessage' field */
    public org.openrtb.common.api.Status.Builder setStatusMessage(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.statusMessage = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'statusMessage' field has been set */
    public boolean hasStatusMessage() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'statusMessage' field */
    public org.openrtb.common.api.Status.Builder clearStatusMessage() {
      statusMessage = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Status build() {
      try {
        Status record = new Status();
        record.requestToken = fieldSetFlags()[0] ? this.requestToken : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.statusCode = fieldSetFlags()[1] ? this.statusCode : (java.lang.Integer) defaultValue(fields()[1]);
        record.statusMessage = fieldSetFlags()[2] ? this.statusMessage : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
