package utility;
import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		if((18 <= user.getAge() && user.getAge() <= 35) && (155 <=user.getHeight() && user.getHeight()<=170 ) && (55<= user.getWeight() && user.getWeight()<= 90) && (user.getCountry().equals("ProGrad"))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		if(Integer.parseInt(points) > 80) {
			return true;
		}
		return false;
	}

	@Override
	boolean basicEligibilityCheck(User user) {
		return checkUser(user);
	}
	
}







