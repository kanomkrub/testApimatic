/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class ObjectValue 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1982719906606258564L;
    private String id;
    private String name;
    private String type;
    private String duration;
    private String status;
    private String recordStatus;
    private List<TripTranslate> tripTranslate;
    private TripImage tripImage;
    private List<TripPlanItem> tripPlanItem;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("duration")
    public String getDuration ( ) { 
        return this.duration;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("duration")
    public void setDuration (String value) { 
        this.duration = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recordStatus")
    public String getRecordStatus ( ) { 
        return this.recordStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recordStatus")
    public void setRecordStatus (String value) { 
        this.recordStatus = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tripTranslate")
    public List<TripTranslate> getTripTranslate ( ) { 
        return this.tripTranslate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tripTranslate")
    public void setTripTranslate (List<TripTranslate> value) { 
        this.tripTranslate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tripImage")
    public TripImage getTripImage ( ) { 
        return this.tripImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tripImage")
    public void setTripImage (TripImage value) { 
        this.tripImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tripPlanItem")
    public List<TripPlanItem> getTripPlanItem ( ) { 
        return this.tripPlanItem;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tripPlanItem")
    public void setTripPlanItem (List<TripPlanItem> value) { 
        this.tripPlanItem = value;
    }
 
}
