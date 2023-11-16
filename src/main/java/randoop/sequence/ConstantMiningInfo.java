package randoop.sequence;

import java.util.HashMap;
import java.util.Map;

public abstract class ConstantMiningInfo<T> {
    private int classCount;

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public abstract void addSequenceFrequency(T type, Sequence sequence, Integer frequency);

    public abstract void addSequenceOccurrence(T type, Sequence sequence, Integer frequency);

    protected void isPrimitive(Sequence seq) {
        if (seq == null) throw new IllegalArgumentException("seq is null");
        if (!seq.isNonreceiver()) {
            throw new IllegalArgumentException("seq is not a primitive sequence");
        }
    }
}

class GeneralInfo extends ConstantMiningInfo<Object> {
    private final Map<Sequence, Integer> sequenceFrequencyMap;

    private final Map<Sequence, Integer> sequenceOccurrenceMap;

    public GeneralInfo() {
        sequenceFrequencyMap = new HashMap<>();
        sequenceOccurrenceMap = new HashMap<>();
    }

    public Map<Sequence, Integer> getSequenceFrequencyMap() {
        return sequenceFrequencyMap;
    }

    @Override
    public void addSequenceFrequency(Object type, Sequence sequence, Integer frequency) {
        isPrimitive(sequence);
        sequenceFrequencyMap.put(sequence, frequency);
    }

    public Map<Sequence, Integer> getSequenceOccurrenceMap() {
        return sequenceOccurrenceMap;
    }


    @Override
    public void addSequenceOccurrence(Object type, Sequence sequence, Integer occurrence) {
        isPrimitive(sequence);
        sequenceOccurrenceMap.put(sequence, occurrence);
    }
}

class ClassOrPackageInfo<T> extends ConstantMiningInfo<T> {
    private final Map<T, Map<Sequence, Integer>> sequenceFrequencyMap;
    private final Map<T, Map<Sequence, Integer>> sequenceOccurrenceMap;

    public ClassOrPackageInfo() {
        sequenceFrequencyMap = new HashMap<>();
        sequenceOccurrenceMap = new HashMap<>();
    }
    @Override
    public void addSequenceFrequency(T type, Sequence sequence, Integer frequency) {
        isPrimitive(sequence);
        Map<Sequence, Integer> freqMap = sequenceFrequencyMap.computeIfAbsent(type, __ -> new HashMap<>());
        freqMap.put(sequence, frequency);
    }

    public Map<T, Map<Sequence, Integer>> getSequenceFrequencyMap() {
        return sequenceFrequencyMap;
    }

    @Override
    public void addSequenceOccurrence(T type, Sequence sequence, Integer occurrence) {
        isPrimitive(sequence);
        Map<Sequence, Integer> freqMap = sequenceOccurrenceMap.computeIfAbsent(type, __ -> new HashMap<>());
        freqMap.put(sequence, occurrence);
    }

    public Map<T, Map<Sequence, Integer>> getSequenceOccurrenceMap() {
        return sequenceOccurrenceMap;
    }
}

