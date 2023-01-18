package fairyShop.models;

public class ShopImpl implements Shop{
    @Override
    public void craft(Present present, Helper helper) {
      if (helper.canWork()){
          for (Instrument instrument : helper.getInstruments()) {
              while (!instrument.isBroken()){
                  if (!instrument.isBroken() && helper.canWork()){
                      present.getCrafted();
                      helper.work();
                      instrument.use();
                  }
                  if (present.isDone()){
                     return;
                  }
                  if (instrument.isBroken()){
                     return;
                  }
              }
          }
      }
    }
}
