
// Date --> String
String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

// String --> Date
String string = "January 2, 2010";
DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
Date date = format.parse(string);

// Important note is that SimpleDateFormat
// is not thread safe. In other words, you should never declare and assign it as a static or instance variable and then reuse from different methods/threads. You should always create it brand new within the method local scope.

Letter  Date or Time Component  Presentation        Examples
------  ----------------------  ------------------  -------------------------------------
G       Era designator          Text                AD
y       Year                    Year                1996; 96
Y       Week year               Year                2009; 09
M/L     Month in year           Month               July; Jul; 07
w       Week in year            Number              27
W       Week in month           Number              2
D       Day in year             Number              189
d       Day in month            Number              10
F       Day of week in month    Number              2
E       Day in week             Text                Tuesday; Tue
u       Day number of week      Number              1
a       Am/pm marker            Text                PM
H       Hour in day (0-23)      Number              0
k       Hour in day (1-24)      Number              24
K       Hour in am/pm (0-11)    Number              0
h       Hour in am/pm (1-12)    Number              12
m       Minute in hour          Number              30
s       Second in minute        Number              55
S       Millisecond             Number              978
z       Time zone               General time zone   Pacific Standard Time; PST; GMT-08:00
Z       Time zone               RFC 822 time zone   -0800
X       Time zone               ISO 8601 time zone  -08; -0800; -08:00
