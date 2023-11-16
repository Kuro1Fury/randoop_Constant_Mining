package randoop.sequence;

import java.util.HashMap;
import java.util.Map;

public class ClassOrPackageInfo<T> extends ConstantMiningInfo<T> {
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
