package JDK7.CollectionsFramework.Interfaces.Comparator;

import corejava.collections.Comparable.Movie;

import java.util.Comparator;

public class NameComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
