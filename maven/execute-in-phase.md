* Das Goal "time" wird in der Phase "process-test-resources" ausgeführt.
* Plugins können auch eine Default-Phase definiert haben, dann ist die Angabe der Phase optional.


      <plugin>
        <groupId>com.mycompany.example</groupId>
        <artifactId>display-maven-plugin</artifactId>
        <version>1.0</version>
        <executions>
          <execution>
            <phase>process-test-resources</phase>
            <goals>
              <goal>time</goal>
            </goals>
          </execution>
        </executions>
      </plugin>


