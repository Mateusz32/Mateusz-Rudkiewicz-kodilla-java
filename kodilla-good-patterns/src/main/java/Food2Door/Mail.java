package Food2Door;

public class Mail implements InformationService{
    @Override
    public void sendInformation(OrderRequestFromClient orderRequest) {
        System.out.println("Send information about order to: "+orderRequest.getClient().getName()+
                " "+orderRequest.getClient().getSurname()+" to adress: "+orderRequest.getClient().getAdressMail());
    }
}
