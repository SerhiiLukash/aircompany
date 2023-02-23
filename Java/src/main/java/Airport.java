import Planes.experimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
            return militaryPlanes;
        }

        public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity () {
            List<PassengerPlane> passengerPlanes = getPassengerPlanes();
            PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
            for (Plane plane : passengerPlanes) {
                if (plane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                    planeWithMaxCapacity = plane;
                }
            }
            return planeWithMaxCapacity;
        }

        public List<MilitaryPlane> getMilitaryPlanesByType (){
            List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
            List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
            List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
            for (Plane plane : militaryPlanes) {
                if (plane.getType() == MilitaryType.TRANSPORT) {
                    transportMilitaryPlanes.add(plane);
                } else (plane.getType() == MilitaryType.BOMBER) {
                    bomberMilitaryPlanes.add(plane);
                }
            }
            return transportMilitaryPlanes;
            return bomberMilitaryPlanes;
        }


        public List<experimentalPlane> getExperimentalPlanes () {
            List<experimentalPlane> experimentalPlanes = new ArrayList<>();
            for (Plane plane : planes) {
                if (plane instanceof experimentalPlane) {
                    experimentalPlanes.add((experimentalPlane) plane);
                }
            }
            return experimentalPlanes;
        }

        public Airport sortByMaxDistance () {

            planes.sort(Comparator.comparingInt(Plane::getMaxFlightDistance));
            return this;
        }


        public Airport sortByMaxSpeed () {
            planes.sort(Comparator.comparingInt(Plane::getMaxSpeed));
            return this;
        }

        public Airport sortByMaxLoadCapacity () {
            planes.sort(Comparator.comparingInt(Plane::getMaxLoadCapacity));
            return this;
        }

        public List<? extends Plane> getPlanes () {
            return planes;
        }


        @Override
        public String toString () {
            return "Airport{" +
                    "Planes=" + planes.toString() +
                    '}';
        }

    }
