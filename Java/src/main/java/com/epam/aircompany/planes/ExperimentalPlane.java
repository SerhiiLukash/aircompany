package com.epam.aircompany.planes;

import com.epam.aircompany.models.ClassificationLevel;
import com.epam.aircompany.models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private ClassificationLevel classificationLevel;
    private ExperimentalTypes experimentalTypes;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.classificationLevel = classificationLevel;
        this.experimentalTypes = experimentalTypes;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ExperimentalPlane that = (ExperimentalPlane) object;
        return java.util.Objects.equals(classificationLevel, that.classificationLevel);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), classificationLevel);
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
