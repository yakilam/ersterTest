package dev.yakilam.gamewg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dorf {
    @Id
    private int dorfId;
    private String dorfName;
    private int dorfXKoordinate;
    private int dorfYKoordinate;
    private int playerID;

}
