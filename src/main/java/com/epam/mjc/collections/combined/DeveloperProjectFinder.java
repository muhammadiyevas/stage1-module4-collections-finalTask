package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for (String project : projects.keySet()) {
            Set<String> developers = projects.get(project);
            if (developers.contains(developer)) {
                result.add(project);
            }
        }

        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String project1, String project2) {
                int lengthComparison = Integer.compare(project2.length(), project1.length());
                if (lengthComparison != 0) {
                    return lengthComparison;
                } else {
                    return project2.compareTo(project1);
                }
            }
        });

        return result;
    }
}







