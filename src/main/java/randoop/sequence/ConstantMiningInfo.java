package randoop.sequence;

import java.util.HashMap;
import java.util.Map;

public class ConstantMiningInfo<T> {
    private int classCount;

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public void addSequenceFrequency(T type, Sequence sequence, Integer frequency) {

    }

    public void addSequenceOccurrence(T type, Sequence sequence, Integer frequency) {

    }

    protected void isPrimitive(Sequence seq) {
        if (seq == null) throw new IllegalArgumentException("seq is null");
        if (!seq.isNonreceiver()) {
            throw new IllegalArgumentException("seq is not a primitive sequence");
        }
    }
}

