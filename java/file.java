// Get File from Classpath
File source = new File(classLoader.getResource("source").getFile());

// Get File from Classpath
URL url = this.getClass().getResource("/com/path/to/file.txt")
File file = new File(url.toURI());

// Beispiel: datei.txt in resources:
URL url = this.getClass().getResource("/datei.txt");
File file = new File(url.toURI());

// read file from same package
// datei liegt im selben package wie die benutzende klasse 
URL url = this.getClass().getResource("file.txt");
File file = new File(url.toURI());

//Read all .txt files in folder
File folder = new File("/path/to/files");
File[] listOfFiles = folder.listFiles();

for (int i = 0; i < listOfFiles.length; i++) {
  File file = listOfFiles[i];
  if (file.isFile() && file.getName().endsWith(".txt")) {
    String content = FileUtils.readFileToString(file);
    /* do somthing with content */
  }
}

//http://stackoverflow.com/questions/326390/
//how-to-create-a-java-string-from-the-contents-of-a-file
static String readFile(String path, Charset encoding)
  throws IOException
{
  byte[] encoded = Files.readAllBytes(Paths.get(path));
  return new String(encoded, encoding);
}
//The StandardCharsets class define some constants for the encodings required of all Java runtimes:
String content = readFile("test.txt", StandardCharsets.UTF_8);
//The platform default is available from the Charset class itself:
String content = readFile("test.txt", Charset.defaultCharset());


// Read all files in a folder
// Java8
Files.walk(Paths.get("/home/you/Desktop")).forEach(filePath -> {
    if (Files.isRegularFile(filePath)) {
        System.out.println(filePath);
    }
});

// Zugriff auf Datei im Pakte (für Unittests..)
File makroFileFromClassPath = new File(EvzTest.class.getResource("evzo.dot").getPath());
// für maven bitte datei nach ressources, nicht ins Paket: das "/" ist hier wichtig !!
File makroFileFromClassPath = new File(EvzTest.class.getResource("/evzo.dot").getPath());

// File Separator ..
; File.pathSeparator
; File.pathSeparatorChar
\ File.separatorChar
\ File.separator

// copy
Path sourceFile = new File(file.getPath()).toPath();
Path targetFile = new File(folder + "/" + beschreibung + ".json").toPath();
Files.copy(sourceFile, targetFile, REPLACE_EXISTING);

// mkdir
new File(folder).mkdir();

// String to File
//In Java 7 you can do this:
String content = "Hello File!";
String path = "C:/a.txt";
Files.write( Paths.get(path), content.getBytes(), StandardOpenOption.CREATE);

// File

// create temp file
File temp = File.createTempFile("temp-file-name", ".tmp");

// get temp folder from system
System.getProperty("java.io.tmpdir")

// byte[] to File
FileOutputStream fos = new FileOutputStream("pathname");
fos.write(myByteArray);
fos.close();

// Read File line by line
try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    String line;
    while ((line = br.readLine()) != null) {
       // process the line.
    }
}


// Read file in package
 try (
    InputStream is = getClass().getClassLoader().getResourceAsStream("com/game/file.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while(null != (line = br.readLine())) {
                System.out.println(line);
            }
        }


// Delete Folder recurively, Java7
Path directory = Paths.get("/tmp");
Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
   @Override
   public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
       Files.delete(file);
       return FileVisitResult.CONTINUE;
   }

   @Override
   public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
       Files.delete(dir);
       return FileVisitResult.CONTINUE;
   }
});

//How to get the filename without the extension in Java?
fileNameWithOutExt = "test.xml".replaceFirst("[.][^.]+$", "");

// Apache Commons
FileUtils.readFileToString(new File("..."))
String[] lines = StringUtils.split(FileUtils.readFileToString(new File("...")), '\n');
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.5</version>
</dependency>


// File.separator and File.pathSeparator
File.pathSeparator is used to separate individual file paths in a list of file paths. Consider on windows, the PATH environment variable. You use a ; to separate the file paths so on Windows File.pathSeparator would be ;.
File.separator is either / or \ that is used to split up the path to a specific file. For example on Windows it is \ or C:\Documents\Test
