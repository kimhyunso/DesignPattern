package 옵저버패턴.subject;

import 옵저버패턴.observer.Observer;

public interface Subject {
   public void registerObserver(Observer o);
   public void removeObserver(Observer o);
   public void notifyObserver();
}
