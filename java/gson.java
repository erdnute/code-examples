//Pretty-Print JSON in Java

Gson gson = new GsonBuilder().setPrettyPrinting().create();
JsonParser jp = new JsonParser();
JsonElement je = jp.parse(uglyJSONString);
String prettyJsonString = gson.toJson(je);

String json = new Gson().toJson(new Foo());

<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.6.1</version>
</dependency>  
