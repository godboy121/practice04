package prob6;

public class MyBase extends Base{
	public void service(String state)
	{
		if(state.equals("낮"))
		{
			day();
		}
		else
		{
			night(state);
		}
	}
	
	public void day(){
		System.out.println("낮에는 열심히 일하자!");
	}
	public void night(String state){
		if(state.equals("오후"))
		{
			System.out.println("오후도 마찬가지로 일해야 합니다.");
		}
		else
			super.service(state);
	}
	

	
}
