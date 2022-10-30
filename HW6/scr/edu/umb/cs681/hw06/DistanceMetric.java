package edu.umb.cs680.hw02;

import java.util.List;

public interface DistanceMetric {
	 public abstract double distance(List<Double> p1, List<Double> p2);
}

DistanceMetric distance = (a,b) -> {
	for (i = 0; i < a.size(); i++) 
	{
		double value1 = a.get(i);
		double value2 = b.get(i);
		return value1-value2;
	}
  
  Path path = Paths.get("input");
try( Stream<String> lines = Files.lines(path) 
   )
{
  List<List<String>> matrix = lines.map
    ( 
    line -> {
      return Stream.of( line.split(" ") 
                      )
        .map(value->value.substring("CVSFile.docx")
                           ).collect
        ( 
        Collectors.toList() 
      ); 
    }
  )
    .collect( Collectors.toList() 
            );
} 
catch (IOExceptionex) {}
}
}
