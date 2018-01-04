====== Mockito ======
//Mockito-Imports
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.AdditionalAnswers.*; 

WpftDao dao = mock(WpftDao.class);
when(dao.createExample(anyString(), anyString())).thenReturn(new ExampleFo());
when(dao.findTraegerverbandByName(VERBAND_NAME)).thenReturn(null);
when(dao.insert(any(Fachobjekt.class))).thenReturn(verband1);

// Beispiel Mock soll erstes Argument zurück geben:
when(dao.insertKostentraegerMitarbeiter(any(KostentraegerMitarbeiterFo.class))).then(__returnsFirstArg()__);

// Beispiel Eingabeparameter beliebige Instanz einer spez. Klasse :
when(mymock.method(any(KostentraegerMitarbeiterFo.class))).thenReturn(null);

// selective & explicit verification

 verify(mockedList).add("one");
 verify(mockedList).clear();

//Any
verify(dao).saveDelosFo(any(DelosFo.class));
when(mockedList.get(anyInt())).thenReturn("element");

//Verfiy: wird nicht aufgerufen
verify(mock, never()).method(arg);

//following two verifications work exactly the same - times(1) is used by default
 verify(mockedList).add("once");
 verify(mockedList, times(1)).add("once");
//verification using never(). never() is an alias to times(0)
 verify(mockedList, never()).add("never happened");
//verification using atLeastOnce()
  verify(mockedList, atLeastOnce()).add("three times");

any(MyClass.class)
anyString()
anySet()
anyObject()

// Capture
// die sache mit den annotationen braucht man nur für Generics wie List<String>..
@Captor
    private ArgumentCaptor<List<IConfigurationItem>> argumentCaptor;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);


ArgumentCaptor<IWorkorder> woCapture = ArgumentCaptor.forClass(IWorkorder.class);
verify(cmdbApi).updateWorkorder(woCapture.capture(), anyString(), any(Date.class), anyString(), argumentCaptor.capture(), anyObject(), anyObject());

System.out.println(woCapture.getValue().getDescription());
System.out.println(argumentCaptor.getAllValues().size());
