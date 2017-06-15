package com.github.dockerjava.api.command;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.CheckForNull;
import java.util.List;

/**
 *
 * @author mramach
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LayerHistory {

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("Created")
    private String created;

    @JsonProperty("CreatedBy")
    private String createdBy;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("Size")
    private Long size;

    @JsonProperty("Tags")
    private List<String> tags;

    /**
     * @see #comment
     */
    @CheckForNull
    public String getComment() {
        return comment;
    }

    /**
     * @see #comment
     */
    public LayerHistory withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * @see #created
     */
    @CheckForNull
    public String getCreated() {
        return created;
    }

    /**
     * @see #created
     */
    public LayerHistory withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * @see #createdBy
     */
    @CheckForNull
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @see #createdBy
     */
    public LayerHistory withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * @see #id
     */
    @CheckForNull
    public String getId() {
        return id;
    }

    /**
     * @see #id
     */
    public LayerHistory withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * @see #repoTags
     */
    @CheckForNull
    public List<String> getTags() {
        return tags;
    }

    /**
     * @see #repoTags
     */
    public LayerHistory withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * @see #size
     */
    @CheckForNull
    public Long getSize() {
        return size;
    }

    /**
     * @see #size
     */
    public LayerHistory withSize(Long size) {
        this.size = size;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
