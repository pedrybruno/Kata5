package kata5;

public class MockMailLoader implements MailLoader{

    @Override
    public Mail[] load() {
      Mail[] mails = new Mail[5];
      mails[0] = new Mail("pedrybruno@gmail.com");
      mails[1] = new Mail("pedrybruno4@gmail.com");
      mails[2] = new Mail("pedrybruno3@gmail.com");
      mails[3] = new Mail("pedrybrunos@yahoo.com");
      mails[4] = new Mail("pedrybruno@hotmail.com");
      return mails;
    }
}
