package be.gilles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoGetallen {

    private final List<Integer> getallen;
    private int[] lottoGetallen;

    public LottoGetallen() {
        this.getallen = new ArrayList<>();
        this.lottoGetallen = new int[6];
        IntStream.range(1, 45).forEach(getallen::add);
    }

    public void genereerLottoGetallen() {

        Collections.shuffle(getallen);

        for (int i = 0; i < 6; i++) {
            this.lottoGetallen[i] = getallen.get(i);
        }
    }

    public String toonLottoGetallen() {
        return Arrays.stream(lottoGetallen).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }
}
