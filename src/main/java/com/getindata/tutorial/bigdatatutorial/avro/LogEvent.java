/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.getindata.tutorial.bigdatatutorial.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LogEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogEvent\",\"namespace\":\"com.getindata.tutorial.bigdatatutorial.avro\",\"fields\":[{\"name\":\"server\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"string\"},{\"name\":\"userid\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"songid\",\"type\":\"int\"},{\"name\":\"duration\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence server;
  @Deprecated public java.lang.CharSequence timestamp;
  @Deprecated public int userid;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public int songid;
  @Deprecated public int duration;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public LogEvent() {}

  /**
   * All-args constructor.
   */
  public LogEvent(java.lang.CharSequence server, java.lang.CharSequence timestamp, java.lang.Integer userid, java.lang.CharSequence name, java.lang.Integer songid, java.lang.Integer duration) {
    this.server = server;
    this.timestamp = timestamp;
    this.userid = userid;
    this.name = name;
    this.songid = songid;
    this.duration = duration;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return server;
    case 1: return timestamp;
    case 2: return userid;
    case 3: return name;
    case 4: return songid;
    case 5: return duration;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: server = (java.lang.CharSequence)value$; break;
    case 1: timestamp = (java.lang.CharSequence)value$; break;
    case 2: userid = (java.lang.Integer)value$; break;
    case 3: name = (java.lang.CharSequence)value$; break;
    case 4: songid = (java.lang.Integer)value$; break;
    case 5: duration = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'server' field.
   */
  public java.lang.CharSequence getServer() {
    return server;
  }

  /**
   * Sets the value of the 'server' field.
   * @param value the value to set.
   */
  public void setServer(java.lang.CharSequence value) {
    this.server = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
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
   * Gets the value of the 'userid' field.
   */
  public java.lang.Integer getUserid() {
    return userid;
  }

  /**
   * Sets the value of the 'userid' field.
   * @param value the value to set.
   */
  public void setUserid(java.lang.Integer value) {
    this.userid = value;
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
   * Gets the value of the 'songid' field.
   */
  public java.lang.Integer getSongid() {
    return songid;
  }

  /**
   * Sets the value of the 'songid' field.
   * @param value the value to set.
   */
  public void setSongid(java.lang.Integer value) {
    this.songid = value;
  }

  /**
   * Gets the value of the 'duration' field.
   */
  public java.lang.Integer getDuration() {
    return duration;
  }

  /**
   * Sets the value of the 'duration' field.
   * @param value the value to set.
   */
  public void setDuration(java.lang.Integer value) {
    this.duration = value;
  }

  /** Creates a new LogEvent RecordBuilder */
  public static com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder newBuilder() {
    return new com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder();
  }
  
  /** Creates a new LogEvent RecordBuilder by copying an existing Builder */
  public static com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder newBuilder(com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder other) {
    return new com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder(other);
  }
  
  /** Creates a new LogEvent RecordBuilder by copying an existing LogEvent instance */
  public static com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder newBuilder(com.getindata.tutorial.bigdatatutorial.avro.LogEvent other) {
    return new com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder(other);
  }
  
  /**
   * RecordBuilder for LogEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LogEvent>
    implements org.apache.avro.data.RecordBuilder<LogEvent> {

    private java.lang.CharSequence server;
    private java.lang.CharSequence timestamp;
    private int userid;
    private java.lang.CharSequence name;
    private int songid;
    private int duration;

    /** Creates a new Builder */
    private Builder() {
      super(com.getindata.tutorial.bigdatatutorial.avro.LogEvent.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.server)) {
        this.server = data().deepCopy(fields()[0].schema(), other.server);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userid)) {
        this.userid = data().deepCopy(fields()[2].schema(), other.userid);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.songid)) {
        this.songid = data().deepCopy(fields()[4].schema(), other.songid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.duration)) {
        this.duration = data().deepCopy(fields()[5].schema(), other.duration);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LogEvent instance */
    private Builder(com.getindata.tutorial.bigdatatutorial.avro.LogEvent other) {
            super(com.getindata.tutorial.bigdatatutorial.avro.LogEvent.SCHEMA$);
      if (isValidValue(fields()[0], other.server)) {
        this.server = data().deepCopy(fields()[0].schema(), other.server);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userid)) {
        this.userid = data().deepCopy(fields()[2].schema(), other.userid);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.songid)) {
        this.songid = data().deepCopy(fields()[4].schema(), other.songid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.duration)) {
        this.duration = data().deepCopy(fields()[5].schema(), other.duration);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'server' field */
    public java.lang.CharSequence getServer() {
      return server;
    }
    
    /** Sets the value of the 'server' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder setServer(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.server = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'server' field has been set */
    public boolean hasServer() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'server' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder clearServer() {
      server = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.CharSequence getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.timestamp = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timestamp' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'userid' field */
    public java.lang.Integer getUserid() {
      return userid;
    }
    
    /** Sets the value of the 'userid' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder setUserid(int value) {
      validate(fields()[2], value);
      this.userid = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'userid' field has been set */
    public boolean hasUserid() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'userid' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder clearUserid() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder setName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.name = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'name' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder clearName() {
      name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'songid' field */
    public java.lang.Integer getSongid() {
      return songid;
    }
    
    /** Sets the value of the 'songid' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder setSongid(int value) {
      validate(fields()[4], value);
      this.songid = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'songid' field has been set */
    public boolean hasSongid() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'songid' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder clearSongid() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'duration' field */
    public java.lang.Integer getDuration() {
      return duration;
    }
    
    /** Sets the value of the 'duration' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder setDuration(int value) {
      validate(fields()[5], value);
      this.duration = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'duration' field has been set */
    public boolean hasDuration() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'duration' field */
    public com.getindata.tutorial.bigdatatutorial.avro.LogEvent.Builder clearDuration() {
      fieldSetFlags()[5] = false;
      return this;
    }

    public LogEvent build() {
      try {
        LogEvent record = new LogEvent();
        record.server = fieldSetFlags()[0] ? this.server : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.userid = fieldSetFlags()[2] ? this.userid : (java.lang.Integer) defaultValue(fields()[2]);
        record.name = fieldSetFlags()[3] ? this.name : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.songid = fieldSetFlags()[4] ? this.songid : (java.lang.Integer) defaultValue(fields()[4]);
        record.duration = fieldSetFlags()[5] ? this.duration : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
