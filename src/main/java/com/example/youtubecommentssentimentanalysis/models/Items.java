package com.example.youtubecommentssentimentanalysis.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Items {

    @JsonProperty("snippet")
    private Snippet snippets;


}
