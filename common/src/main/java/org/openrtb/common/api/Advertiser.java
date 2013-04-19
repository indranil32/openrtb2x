/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Advertiser extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Advertiser\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"landingPageTLD\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"timestamp\",\"type\":[\"long\",\"null\"]},{\"name\":\"blocklist\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"BlocklistObj\",\"fields\":[{\"name\":\"publisherID\",\"type\":[\"string\",\"null\"]},{\"name\":\"publisherName\",\"type\":[\"string\",\"null\"]},{\"name\":\"sideID\",\"type\":[\"string\",\"null\"]},{\"name\":\"siteName\",\"type\":[\"string\",\"null\"]}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   public java.lang.CharSequence landingPageTLD;
   public java.lang.CharSequence name;
   public java.lang.Long timestamp;
   public java.util.List<org.openrtb.common.api.BlocklistObj> blocklist;

  /**
   * Default constructor.
   */
  public Advertiser() {}

  /**
   * All-args constructor.
   */
  public Advertiser(java.lang.CharSequence landingPageTLD, java.lang.CharSequence name, java.lang.Long timestamp, java.util.List<org.openrtb.common.api.BlocklistObj> blocklist) {
    this.landingPageTLD = landingPageTLD;
    this.name = name;
    this.timestamp = timestamp;
    this.blocklist = blocklist;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return landingPageTLD;
    case 1: return name;
    case 2: return timestamp;
    case 3: return blocklist;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: landingPageTLD = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: timestamp = (java.lang.Long)value$; break;
    case 3: blocklist = (java.util.List<org.openrtb.common.api.BlocklistObj>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'landingPageTLD' field.
   */
  public java.lang.CharSequence getLandingPageTLD() {
    return landingPageTLD;
  }

  /**
   * Sets the value of the 'landingPageTLD' field.
   * @param value the value to set.
   */
  public void setLandingPageTLD(java.lang.CharSequence value) {
    this.landingPageTLD = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'blocklist' field.
   */
  public java.util.List<org.openrtb.common.api.BlocklistObj> getBlocklist() {
    return blocklist;
  }

  /**
   * Sets the value of the 'blocklist' field.
   * @param value the value to set.
   */
  public void setBlocklist(java.util.List<org.openrtb.common.api.BlocklistObj> value) {
    this.blocklist = value;
  }

  /** Creates a new Advertiser RecordBuilder */
  public static org.openrtb.common.api.Advertiser.Builder newBuilder() {
    return new org.openrtb.common.api.Advertiser.Builder();
  }
  
  /** Creates a new Advertiser RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.Advertiser.Builder newBuilder(org.openrtb.common.api.Advertiser.Builder other) {
    return new org.openrtb.common.api.Advertiser.Builder(other);
  }
  
  /** Creates a new Advertiser RecordBuilder by copying an existing Advertiser instance */
  public static org.openrtb.common.api.Advertiser.Builder newBuilder(org.openrtb.common.api.Advertiser other) {
    return new org.openrtb.common.api.Advertiser.Builder(other);
  }
  
  /**
   * RecordBuilder for Advertiser instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Advertiser>
    implements org.apache.avro.data.RecordBuilder<Advertiser> {

    private java.lang.CharSequence landingPageTLD;
    private java.lang.CharSequence name;
    private java.lang.Long timestamp;
    private java.util.List<org.openrtb.common.api.BlocklistObj> blocklist;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.Advertiser.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.Advertiser.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Advertiser instance */
    private Builder(org.openrtb.common.api.Advertiser other) {
            super(org.openrtb.common.api.Advertiser.SCHEMA$);
      if (isValidValue(fields()[0], other.landingPageTLD)) {
        this.landingPageTLD = data().deepCopy(fields()[0].schema(), other.landingPageTLD);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.blocklist)) {
        this.blocklist = data().deepCopy(fields()[3].schema(), other.blocklist);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'landingPageTLD' field */
    public java.lang.CharSequence getLandingPageTLD() {
      return landingPageTLD;
    }
    
    /** Sets the value of the 'landingPageTLD' field */
    public org.openrtb.common.api.Advertiser.Builder setLandingPageTLD(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.landingPageTLD = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'landingPageTLD' field has been set */
    public boolean hasLandingPageTLD() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'landingPageTLD' field */
    public org.openrtb.common.api.Advertiser.Builder clearLandingPageTLD() {
      landingPageTLD = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.openrtb.common.api.Advertiser.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.openrtb.common.api.Advertiser.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public org.openrtb.common.api.Advertiser.Builder setTimestamp(java.lang.Long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'timestamp' field */
    public org.openrtb.common.api.Advertiser.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'blocklist' field */
    public java.util.List<org.openrtb.common.api.BlocklistObj> getBlocklist() {
      return blocklist;
    }
    
    /** Sets the value of the 'blocklist' field */
    public org.openrtb.common.api.Advertiser.Builder setBlocklist(java.util.List<org.openrtb.common.api.BlocklistObj> value) {
      validate(fields()[3], value);
      this.blocklist = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'blocklist' field has been set */
    public boolean hasBlocklist() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'blocklist' field */
    public org.openrtb.common.api.Advertiser.Builder clearBlocklist() {
      blocklist = null;
      fieldSetFlags()[3] = false;
      return this;
    }

 
    public Advertiser build() {
      try {
        Advertiser record = new Advertiser();
        record.landingPageTLD = fieldSetFlags()[0] ? this.landingPageTLD : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        record.blocklist = fieldSetFlags()[3] ? this.blocklist : (java.util.List<org.openrtb.common.api.BlocklistObj>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
