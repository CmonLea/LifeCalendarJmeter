package excel;

public enum Color {
	A_BY_TICKET_SCANNING("打板-逐票扫描", 700001),
	A_BY_TICKET_SCANNING_NETWORK_RETRUN("打板-逐票扫描(网络返回）", 700002),
	A_TO_CHECK("打板-流向校验", 700003),
	FORCED_ADDING_BOX("强制加件入板箱", 700004),
	DELETING_IN_THEBOARD("板中删除",700005), 
	A_SIGN_HANGING_AIR_PRINT("航空打板打印挂签", 701001),
	AVIATION_HANDOVER("航空交接", 800001);
	// 成员变量
	private String name;
	private int index;

	// 构造方法
	private Color(String name, int index) {
		this.name = name;
		this.index = index;
	}

	// 覆盖方法
	@Override
	public String toString() {
		return this.index + "_" + this.name;
	}
}