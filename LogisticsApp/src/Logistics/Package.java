package Logistics;

public class Package {
    private String SenderName;
    private Recipient receiver;
    private String trackingNumber;


    public Package(String trackingNumber, Recipient receiver, String SenderName ) {
      this.trackingNumber = trackingNumber;
      this.receiver = receiver;
      this.SenderName = SenderName;
    }

    public Package(){

    }

    public String getSenderName() {
        return SenderName;
    }

    public Recipient getReceiver() {
        return receiver;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }


}

