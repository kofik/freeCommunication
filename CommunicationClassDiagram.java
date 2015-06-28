package freeCommunication

class Conference {
	protected string idConf;
	protected string title;
	public  description;
	protected string loaction;
	protected string type;
	protected Date startAt;
	protected Date endAt;
	public Caller adminName;

	public Conference() {
		
	}

	public void callDuration () {
		
	}

	public void messageSize () {
		
	}

	public boolean phoneState () {
		
	}

	public void sendPublicMessage () {
		
	}

	public void sendPrivateMessage () {
		
	}

	public void totalParticipant () {
		
	}

}

/*(NULL)*/
class VoiceMail {
	protected integer idVoiceMail;
	protected Date date;
	protected string context;
	protected text mailBox;
	protected string passwd;
	protected string fullName;
	protected string email;
	protected Object attach;
	protected  attachfmt;
	public  pager;

	public VoiceMail() {
		
	}

	public void leaveVoiceMail () {
		
	}

	public void textToVoiceMail () {
		
	}

}

/*(NULL)*/
class Caller {
	protected string idCaller;
	protected string name;
	protected string username;
	protected string displayName;
	protected string phoneNumber;
	protected string loaction;
	protected Date birthDate;
	protected string sex;
	protected string email;
	protected string street;
	protected  streetNumber;
	protected  zipCode;
	protected string city;
	protected string state;
	protected string type;

	public Caller() {
		
	}

	public void hasCredit () {
		
	}

	public void callDuration () {
		
	}

	public void messageSize () {
		
	}

	public boolean phoneState () {
		
	}

	public void deviceInfo () {
		
	}

}

class Contact {
	protected string idContact;
	protected string name;
	protected int phoneNumber;
	protected string loaction;
	protected Date birthDate;
	protected string sex;
	protected string email;
	protected string street;
	protected  streetNumber;
	protected  zipCode;
	protected string city;
	protected  state;

	public Contact() {
		
	}

	public void createContact () {
		
	}

}

class Call {
	protected string idCall;
	Caller from;
	Callee to;
	protected string type;
	protected string loaction;
	protected date startCallAt;
	protected date endCallAt;

	public Call() {
		
	}

	public void callDuration () {
		
	}

	public boolean phoneState () {
		
	}

	public void totalParticipant () {
		
	}

}

/*(NULL)*/
class Provider {
	protected string idProvider;
	protected string name;
	protected string loaction;
	protected Date birthDate;
	protected string sex;
	protected string email;
	protected string street;
	protected  streetNumber;
	protected  zipCode;
	protected string city;
	protected string state;

	public Provider() {
		
	}

	public void promote () {
		
	}

	public void checkPromotion () {
		
	}

	public void confirmPromotion () {
		
	}

	public void bannedClient () {
		
	}

}

class Promotion {
	protected string idPromo;
	protected string name;
	protected string loaction;
	protected Date initialDate;
	protected date expirationDate;
	protected string type;

	public Promotion() {
		
	}

	public void promote () {
		
	}

	public void checkPromotion () {
		
	}

	public void confirmPromotion () {
		
	}

	public void bannedClient () {
		
	}

}

/*(NULL)*/
class TelecomManagement {
	public integer id;
	protected Date date;
	private  username;
	private  currencyPerCallInSecond;
	private  currencyPerSentMessageLength;

	public TelecomManagement() {
		
	}

	public void getIdProvider () {
		
	}

	public void getIdCaller () {
		
	}

	public void getIdCallee () {
		
	}

	public void getIdPromotion () {
		
	}

	public void getIdConference () {
		
	}

	public void getIdMessage () {
		
	}

	public void getIdContact () {
		
	}

	public void register () {
		
	}

	public void login () {
		
	}

	public void makeCall () {
		
	}

	public void SendMessage () {
		
	}

	public void receiveMessage () {
		
	}

	public void CallDuration () {
		
	}

	public void connectionType () {
		
	}

	public void listProvider () {
		
	}

	public void listCallerByProvider () {
		
	}

	public void listCalleeByCaller () {
		
	}

	public void dialNumber () {
		
	}

	public void clickToCall () {
		
	}

	public void getVoiceNameToCallInContactList () {
		
	}

	public void mailToFax () {
		
	}

	public void faxToMail () {
		
	}

	public void createProvider () {
		
	}

	public void createConference () {
		
	}

	public void createCaller () {
		
	}

	public void CreateContact () {
		
	}

	public void createCallee () {
		
	}

	public void createPromotion () {
		
	}

	public void findCaller () {
		
	}

	public void findCallee () {
		
	}

	public void findContact () {
		
	}

	public void findProvider () {
		
	}

}

class Callee {
	protected string idCallee;
	protected string name;
	protected int phoneNumber;
	protected string loaction;
	protected Date birthDate;
	protected string sex;
	protected string email;
	protected string street;
	protected  streetNumber;
	protected  zipCode;
	protected string city;

	public Callee() {
		
	}

	public void callDuration () {
		
	}

	public void messageSize () {
		
	}

	public boolean phoneState () {
		
	}

}

class Message {
	protected string idMessage;
	Caller from;
	Callee to;
	protected string type;
	protected string loaction;
	protected date startCallAt;
	protected date endCallAt;
	public text messagBody;

	public Message() {
		
	}

	public void callDuration () {
		
	}

	public boolean phoneState () {
		
	}

	public void totalParticipant () {
		
	}

}

