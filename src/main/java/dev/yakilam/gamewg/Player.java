package dev.yakilam.gamewg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.ArrayList;

@Document(collection = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    private int playerId;
    private String playerName;
    private String playerPassword;
    @DocumentReference
    private ArrayList<Integer> dorfIds;

}
