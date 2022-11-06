package baseball.game;


import baseball.constant.Accuracy;
import baseball.constant.Rules;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static baseball.constant.Rules.PICK_COUNT;

public class Referee {

    public boolean isPerfectAnswer(List<Integer> targetNumbers, List<Integer> userNumbers) {
        validateNumbersLength(targetNumbers, userNumbers);

        Map<Accuracy, Integer> judgeAccuracy = getJudgeAccuracy();
        shout(judgeAccuracy);

        return judgeAccuracy.get(Accuracy.CORRECT_ANSWER) == PICK_COUNT;
    }

    private void validateNumbersLength(List<Integer> targetNumbers, List<Integer> userNumbers) {
        if (targetNumbers.size() != PICK_COUNT || userNumbers.size() != PICK_COUNT) {
            throw new IllegalArgumentException("배열의 길이가 " + PICK_COUNT + "와 같지 않습니다");
        }
    }
}
