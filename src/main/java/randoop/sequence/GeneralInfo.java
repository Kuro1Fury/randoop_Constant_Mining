package randoop.sequence;

import java.util.HashMap;
import java.util.Map;

public class GeneralInfo<T> extends ConstantMiningInfo<T> {
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
    public void addSequenceFrequency(T type, Sequence sequence, Integer frequency) {
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
