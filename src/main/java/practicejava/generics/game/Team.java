package practicejava.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        if (participants.add(participant)) {
            System.out.printf("В команду %s был добавлен участник %s %n", name, participant.getName());
        }
    }

    public void playWith(Team<T> team) {
        System.out.printf("Победила команда - %s", new Random().nextInt(2) == 1 ? name : team.name);
    }
}
