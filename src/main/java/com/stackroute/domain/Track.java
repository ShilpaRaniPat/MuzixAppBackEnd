package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Track")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Track
{
    @Id
    private String trackId;
    private String trackName;
    private String trackComments;
    private String imgUrl;
}

