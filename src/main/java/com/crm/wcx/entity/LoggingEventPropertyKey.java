package com.crm.wcx.entity;

public class LoggingEventPropertyKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event_property.event_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Long eventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event_property.mapped_key
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private String mappedKey;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event_property.event_id
     *
     * @return the value of logging_event_property.event_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event_property.event_id
     *
     * @param eventId the value for logging_event_property.event_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event_property.mapped_key
     *
     * @return the value of logging_event_property.mapped_key
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public String getMappedKey() {
        return mappedKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event_property.mapped_key
     *
     * @param mappedKey the value for logging_event_property.mapped_key
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setMappedKey(String mappedKey) {
        this.mappedKey = mappedKey == null ? null : mappedKey.trim();
    }
}