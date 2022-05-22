package hangso;

public enum TypeSach {
	Khoa_học_tự_nhiên("Khoa học tự nhiên"),
    Văn_học_nghệ_thuật("Văn học nghệ thuật"),
    Điện_tử_viễn_thông("Điện tử viễn thông"),
    Công_nghệ_thông_tin("Công nghệ thông tin");
	
	String value;

	 TypeSach(String value) {
		this.value = value;
	}
}
