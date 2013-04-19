/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class App extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"App\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"domain\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"sectioncat\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"pagecat\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"ver\",\"type\":[\"string\",\"null\"]},{\"name\":\"bundle\",\"type\":[\"string\",\"null\"]},{\"name\":\"privacypolicy\",\"type\":[\"int\",\"null\"]},{\"name\":\"paid\",\"type\":[\"int\",\"null\"]},{\"name\":\"publisher\",\"type\":[{\"type\":\"record\",\"name\":\"Publisher\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"domain\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]},\"null\"]},{\"name\":\"content\",\"type\":[{\"type\":\"record\",\"name\":\"Content\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"episode\",\"type\":[\"int\",\"null\"]},{\"name\":\"title\",\"type\":[\"string\",\"null\"]},{\"name\":\"series\",\"type\":[\"string\",\"null\"]},{\"name\":\"season\",\"type\":[\"string\",\"null\"]},{\"name\":\"url\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"videoquality\",\"type\":[\"int\",\"null\"]},{\"name\":\"keywords\",\"type\":[\"string\",\"null\"]},{\"name\":\"contentrating\",\"type\":[\"string\",\"null\"]},{\"name\":\"userrating\",\"type\":[\"string\",\"null\"]},{\"name\":\"context\",\"type\":[\"string\",\"null\"]},{\"name\":\"livestream\",\"type\":[\"int\",\"null\"]},{\"name\":\"sourcerelationship\",\"type\":[\"int\",\"null\"]},{\"name\":\"producer\",\"type\":[{\"type\":\"record\",\"name\":\"Producer\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"domain\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]},\"null\"]},{\"name\":\"len\",\"type\":[\"int\",\"null\"]},{\"name\":\"qagmediarating\",\"type\":[\"int\",\"null\"]},{\"name\":\"embeddable\",\"type\":[\"int\",\"null\"]},{\"name\":\"language\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]},\"null\"]},{\"name\":\"keywords\",\"type\":[\"string\",\"null\"]},{\"name\":\"storeurl\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   public java.lang.CharSequence id;
   public java.lang.CharSequence name;
   public java.lang.CharSequence domain;
   public java.util.List<java.lang.CharSequence> cat;
   public java.util.List<java.lang.CharSequence> sectioncat;
   public java.util.List<java.lang.CharSequence> pagecat;
   public java.lang.CharSequence ver;
   public java.lang.CharSequence bundle;
   public java.lang.Integer privacypolicy;
   public java.lang.Integer paid;
   public org.openrtb.common.api.Publisher publisher;
   public org.openrtb.common.api.Content content;
   public java.lang.CharSequence keywords;
   public java.lang.CharSequence storeurl;
   public java.lang.CharSequence ext;

  /**
   * Default constructor.
   */
  public App() {}

  /**
   * All-args constructor.
   */
  public App(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence domain, java.util.List<java.lang.CharSequence> cat, java.util.List<java.lang.CharSequence> sectioncat, java.util.List<java.lang.CharSequence> pagecat, java.lang.CharSequence ver, java.lang.CharSequence bundle, java.lang.Integer privacypolicy, java.lang.Integer paid, org.openrtb.common.api.Publisher publisher, org.openrtb.common.api.Content content, java.lang.CharSequence keywords, java.lang.CharSequence storeurl, java.lang.CharSequence ext) {
    this.id = id;
    this.name = name;
    this.domain = domain;
    this.cat = cat;
    this.sectioncat = sectioncat;
    this.pagecat = pagecat;
    this.ver = ver;
    this.bundle = bundle;
    this.privacypolicy = privacypolicy;
    this.paid = paid;
    this.publisher = publisher;
    this.content = content;
    this.keywords = keywords;
    this.storeurl = storeurl;
    this.ext = ext;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return domain;
    case 3: return cat;
    case 4: return sectioncat;
    case 5: return pagecat;
    case 6: return ver;
    case 7: return bundle;
    case 8: return privacypolicy;
    case 9: return paid;
    case 10: return publisher;
    case 11: return content;
    case 12: return keywords;
    case 13: return storeurl;
    case 14: return ext;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: domain = (java.lang.CharSequence)value$; break;
    case 3: cat = (java.util.List<java.lang.CharSequence>)value$; break;
    case 4: sectioncat = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: pagecat = (java.util.List<java.lang.CharSequence>)value$; break;
    case 6: ver = (java.lang.CharSequence)value$; break;
    case 7: bundle = (java.lang.CharSequence)value$; break;
    case 8: privacypolicy = (java.lang.Integer)value$; break;
    case 9: paid = (java.lang.Integer)value$; break;
    case 10: publisher = (org.openrtb.common.api.Publisher)value$; break;
    case 11: content = (org.openrtb.common.api.Content)value$; break;
    case 12: keywords = (java.lang.CharSequence)value$; break;
    case 13: storeurl = (java.lang.CharSequence)value$; break;
    case 14: ext = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
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
   * Gets the value of the 'domain' field.
   */
  public java.lang.CharSequence getDomain() {
    return domain;
  }

  /**
   * Sets the value of the 'domain' field.
   * @param value the value to set.
   */
  public void setDomain(java.lang.CharSequence value) {
    this.domain = value;
  }

  /**
   * Gets the value of the 'cat' field.
   */
  public java.util.List<java.lang.CharSequence> getCat() {
    return cat;
  }

  /**
   * Sets the value of the 'cat' field.
   * @param value the value to set.
   */
  public void setCat(java.util.List<java.lang.CharSequence> value) {
    this.cat = value;
  }

  /**
   * Gets the value of the 'sectioncat' field.
   */
  public java.util.List<java.lang.CharSequence> getSectioncat() {
    return sectioncat;
  }

  /**
   * Sets the value of the 'sectioncat' field.
   * @param value the value to set.
   */
  public void setSectioncat(java.util.List<java.lang.CharSequence> value) {
    this.sectioncat = value;
  }

  /**
   * Gets the value of the 'pagecat' field.
   */
  public java.util.List<java.lang.CharSequence> getPagecat() {
    return pagecat;
  }

  /**
   * Sets the value of the 'pagecat' field.
   * @param value the value to set.
   */
  public void setPagecat(java.util.List<java.lang.CharSequence> value) {
    this.pagecat = value;
  }

  /**
   * Gets the value of the 'ver' field.
   */
  public java.lang.CharSequence getVer() {
    return ver;
  }

  /**
   * Sets the value of the 'ver' field.
   * @param value the value to set.
   */
  public void setVer(java.lang.CharSequence value) {
    this.ver = value;
  }

  /**
   * Gets the value of the 'bundle' field.
   */
  public java.lang.CharSequence getBundle() {
    return bundle;
  }

  /**
   * Sets the value of the 'bundle' field.
   * @param value the value to set.
   */
  public void setBundle(java.lang.CharSequence value) {
    this.bundle = value;
  }

  /**
   * Gets the value of the 'privacypolicy' field.
   */
  public java.lang.Integer getPrivacypolicy() {
    return privacypolicy;
  }

  /**
   * Sets the value of the 'privacypolicy' field.
   * @param value the value to set.
   */
  public void setPrivacypolicy(java.lang.Integer value) {
    this.privacypolicy = value;
  }

  /**
   * Gets the value of the 'paid' field.
   */
  public java.lang.Integer getPaid() {
    return paid;
  }

  /**
   * Sets the value of the 'paid' field.
   * @param value the value to set.
   */
  public void setPaid(java.lang.Integer value) {
    this.paid = value;
  }

  /**
   * Gets the value of the 'publisher' field.
   */
  public org.openrtb.common.api.Publisher getPublisher() {
    return publisher;
  }

  /**
   * Sets the value of the 'publisher' field.
   * @param value the value to set.
   */
  public void setPublisher(org.openrtb.common.api.Publisher value) {
    this.publisher = value;
  }

  /**
   * Gets the value of the 'content' field.
   */
  public org.openrtb.common.api.Content getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(org.openrtb.common.api.Content value) {
    this.content = value;
  }

  /**
   * Gets the value of the 'keywords' field.
   */
  public java.lang.CharSequence getKeywords() {
    return keywords;
  }

  /**
   * Sets the value of the 'keywords' field.
   * @param value the value to set.
   */
  public void setKeywords(java.lang.CharSequence value) {
    this.keywords = value;
  }

  /**
   * Gets the value of the 'storeurl' field.
   */
  public java.lang.CharSequence getStoreurl() {
    return storeurl;
  }

  /**
   * Sets the value of the 'storeurl' field.
   * @param value the value to set.
   */
  public void setStoreurl(java.lang.CharSequence value) {
    this.storeurl = value;
  }

  /**
   * Gets the value of the 'ext' field.
   */
  public java.lang.CharSequence getExt() {
    return ext;
  }

  /**
   * Sets the value of the 'ext' field.
   * @param value the value to set.
   */
  public void setExt(java.lang.CharSequence value) {
    this.ext = value;
  }

  /** Creates a new App RecordBuilder */
  public static org.openrtb.common.api.App.Builder newBuilder() {
    return new org.openrtb.common.api.App.Builder();
  }
  
  /** Creates a new App RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.App.Builder newBuilder(org.openrtb.common.api.App.Builder other) {
    return new org.openrtb.common.api.App.Builder(other);
  }
  
  /** Creates a new App RecordBuilder by copying an existing App instance */
  public static org.openrtb.common.api.App.Builder newBuilder(org.openrtb.common.api.App other) {
    return new org.openrtb.common.api.App.Builder(other);
  }
  
  /**
   * RecordBuilder for App instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<App>
    implements org.apache.avro.data.RecordBuilder<App> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence domain;
    private java.util.List<java.lang.CharSequence> cat;
    private java.util.List<java.lang.CharSequence> sectioncat;
    private java.util.List<java.lang.CharSequence> pagecat;
    private java.lang.CharSequence ver;
    private java.lang.CharSequence bundle;
    private java.lang.Integer privacypolicy;
    private java.lang.Integer paid;
    private org.openrtb.common.api.Publisher publisher;
    private org.openrtb.common.api.Content content;
    private java.lang.CharSequence keywords;
    private java.lang.CharSequence storeurl;
    private java.lang.CharSequence ext;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.App.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.App.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing App instance */
    private Builder(org.openrtb.common.api.App other) {
            super(org.openrtb.common.api.App.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.domain)) {
        this.domain = data().deepCopy(fields()[2].schema(), other.domain);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.cat)) {
        this.cat = data().deepCopy(fields()[3].schema(), other.cat);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sectioncat)) {
        this.sectioncat = data().deepCopy(fields()[4].schema(), other.sectioncat);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pagecat)) {
        this.pagecat = data().deepCopy(fields()[5].schema(), other.pagecat);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.ver)) {
        this.ver = data().deepCopy(fields()[6].schema(), other.ver);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.bundle)) {
        this.bundle = data().deepCopy(fields()[7].schema(), other.bundle);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.privacypolicy)) {
        this.privacypolicy = data().deepCopy(fields()[8].schema(), other.privacypolicy);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.paid)) {
        this.paid = data().deepCopy(fields()[9].schema(), other.paid);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.publisher)) {
        this.publisher = data().deepCopy(fields()[10].schema(), other.publisher);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.content)) {
        this.content = data().deepCopy(fields()[11].schema(), other.content);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.keywords)) {
        this.keywords = data().deepCopy(fields()[12].schema(), other.keywords);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.storeurl)) {
        this.storeurl = data().deepCopy(fields()[13].schema(), other.storeurl);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.ext)) {
        this.ext = data().deepCopy(fields()[14].schema(), other.ext);
        fieldSetFlags()[14] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.openrtb.common.api.App.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public org.openrtb.common.api.App.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.openrtb.common.api.App.Builder setName(java.lang.CharSequence value) {
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
    public org.openrtb.common.api.App.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'domain' field */
    public java.lang.CharSequence getDomain() {
      return domain;
    }
    
    /** Sets the value of the 'domain' field */
    public org.openrtb.common.api.App.Builder setDomain(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.domain = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'domain' field has been set */
    public boolean hasDomain() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'domain' field */
    public org.openrtb.common.api.App.Builder clearDomain() {
      domain = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'cat' field */
    public java.util.List<java.lang.CharSequence> getCat() {
      return cat;
    }
    
    /** Sets the value of the 'cat' field */
    public org.openrtb.common.api.App.Builder setCat(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.cat = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'cat' field has been set */
    public boolean hasCat() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'cat' field */
    public org.openrtb.common.api.App.Builder clearCat() {
      cat = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'sectioncat' field */
    public java.util.List<java.lang.CharSequence> getSectioncat() {
      return sectioncat;
    }
    
    /** Sets the value of the 'sectioncat' field */
    public org.openrtb.common.api.App.Builder setSectioncat(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.sectioncat = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'sectioncat' field has been set */
    public boolean hasSectioncat() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'sectioncat' field */
    public org.openrtb.common.api.App.Builder clearSectioncat() {
      sectioncat = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'pagecat' field */
    public java.util.List<java.lang.CharSequence> getPagecat() {
      return pagecat;
    }
    
    /** Sets the value of the 'pagecat' field */
    public org.openrtb.common.api.App.Builder setPagecat(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.pagecat = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'pagecat' field has been set */
    public boolean hasPagecat() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'pagecat' field */
    public org.openrtb.common.api.App.Builder clearPagecat() {
      pagecat = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'ver' field */
    public java.lang.CharSequence getVer() {
      return ver;
    }
    
    /** Sets the value of the 'ver' field */
    public org.openrtb.common.api.App.Builder setVer(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.ver = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'ver' field has been set */
    public boolean hasVer() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'ver' field */
    public org.openrtb.common.api.App.Builder clearVer() {
      ver = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'bundle' field */
    public java.lang.CharSequence getBundle() {
      return bundle;
    }
    
    /** Sets the value of the 'bundle' field */
    public org.openrtb.common.api.App.Builder setBundle(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.bundle = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'bundle' field has been set */
    public boolean hasBundle() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'bundle' field */
    public org.openrtb.common.api.App.Builder clearBundle() {
      bundle = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'privacypolicy' field */
    public java.lang.Integer getPrivacypolicy() {
      return privacypolicy;
    }
    
    /** Sets the value of the 'privacypolicy' field */
    public org.openrtb.common.api.App.Builder setPrivacypolicy(java.lang.Integer value) {
      validate(fields()[8], value);
      this.privacypolicy = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'privacypolicy' field has been set */
    public boolean hasPrivacypolicy() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'privacypolicy' field */
    public org.openrtb.common.api.App.Builder clearPrivacypolicy() {
      privacypolicy = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'paid' field */
    public java.lang.Integer getPaid() {
      return paid;
    }
    
    /** Sets the value of the 'paid' field */
    public org.openrtb.common.api.App.Builder setPaid(java.lang.Integer value) {
      validate(fields()[9], value);
      this.paid = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'paid' field has been set */
    public boolean hasPaid() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'paid' field */
    public org.openrtb.common.api.App.Builder clearPaid() {
      paid = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'publisher' field */
    public org.openrtb.common.api.Publisher getPublisher() {
      return publisher;
    }
    
    /** Sets the value of the 'publisher' field */
    public org.openrtb.common.api.App.Builder setPublisher(org.openrtb.common.api.Publisher value) {
      validate(fields()[10], value);
      this.publisher = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'publisher' field has been set */
    public boolean hasPublisher() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'publisher' field */
    public org.openrtb.common.api.App.Builder clearPublisher() {
      publisher = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'content' field */
    public org.openrtb.common.api.Content getContent() {
      return content;
    }
    
    /** Sets the value of the 'content' field */
    public org.openrtb.common.api.App.Builder setContent(org.openrtb.common.api.Content value) {
      validate(fields()[11], value);
      this.content = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'content' field has been set */
    public boolean hasContent() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'content' field */
    public org.openrtb.common.api.App.Builder clearContent() {
      content = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'keywords' field */
    public java.lang.CharSequence getKeywords() {
      return keywords;
    }
    
    /** Sets the value of the 'keywords' field */
    public org.openrtb.common.api.App.Builder setKeywords(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.keywords = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'keywords' field has been set */
    public boolean hasKeywords() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'keywords' field */
    public org.openrtb.common.api.App.Builder clearKeywords() {
      keywords = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'storeurl' field */
    public java.lang.CharSequence getStoreurl() {
      return storeurl;
    }
    
    /** Sets the value of the 'storeurl' field */
    public org.openrtb.common.api.App.Builder setStoreurl(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.storeurl = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'storeurl' field has been set */
    public boolean hasStoreurl() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'storeurl' field */
    public org.openrtb.common.api.App.Builder clearStoreurl() {
      storeurl = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /** Gets the value of the 'ext' field */
    public java.lang.CharSequence getExt() {
      return ext;
    }
    
    /** Sets the value of the 'ext' field */
    public org.openrtb.common.api.App.Builder setExt(java.lang.CharSequence value) {
      validate(fields()[14], value);
      this.ext = value;
      fieldSetFlags()[14] = true;
      return this; 
    }
    
    /** Checks whether the 'ext' field has been set */
    public boolean hasExt() {
      return fieldSetFlags()[14];
    }
    
    /** Clears the value of the 'ext' field */
    public org.openrtb.common.api.App.Builder clearExt() {
      ext = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    @Override
    public App build() {
      try {
        App record = new App();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.domain = fieldSetFlags()[2] ? this.domain : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.cat = fieldSetFlags()[3] ? this.cat : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[3]);
        record.sectioncat = fieldSetFlags()[4] ? this.sectioncat : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.pagecat = fieldSetFlags()[5] ? this.pagecat : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[5]);
        record.ver = fieldSetFlags()[6] ? this.ver : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.bundle = fieldSetFlags()[7] ? this.bundle : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.privacypolicy = fieldSetFlags()[8] ? this.privacypolicy : (java.lang.Integer) defaultValue(fields()[8]);
        record.paid = fieldSetFlags()[9] ? this.paid : (java.lang.Integer) defaultValue(fields()[9]);
        record.publisher = fieldSetFlags()[10] ? this.publisher : (org.openrtb.common.api.Publisher) defaultValue(fields()[10]);
        record.content = fieldSetFlags()[11] ? this.content : (org.openrtb.common.api.Content) defaultValue(fields()[11]);
        record.keywords = fieldSetFlags()[12] ? this.keywords : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.storeurl = fieldSetFlags()[13] ? this.storeurl : (java.lang.CharSequence) defaultValue(fields()[13]);
        record.ext = fieldSetFlags()[14] ? this.ext : (java.lang.CharSequence) defaultValue(fields()[14]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
