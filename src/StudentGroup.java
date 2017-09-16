import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		int i=0;
		if(length==null)
		{
			throw(IllegalArgumentException);
		}
		for(i=0;i<length;i++)
		{
			System.out.println(Student[i].id);
			System.out.println(Student[i].fullName);
			System.out.println(Student[i].birthDate);
			System.out.println(Student[i].avgMark);
		}
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		Student[i].id=
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		System.out.println(Student[index]);
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		Student[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		for(i=index;i>0;i--)
		{
			Student[i+1]=Student[i];
			
		}
		Student[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Student[index+1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		int i=index;
		for(i=top;i>index;i--)
		{
			Student[i+1]=Student[i];
		}
		Student[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		int i;
		for(i=index;i<top;i++)
		{
			Student[i]=Student[i+1];
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		for(i=0;i<top;i++)
		{
			int i;
			if(student[i]==student)
			{
				index=i;
			}
			for(i=index;i<top;i++)
			{
				Student[i]=Student[i+1];
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		int i;
		for(i=index;i<top;i++)
		{
			Student[i]=Student[i+1];
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		for(i=0;i<top;i++)
		{
			int i;
			if(student[i]==student)
			{
				index=i;
			}
			for(i=index;i<top;i++)
			{
				Student[i]=Student[i+1];
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int i;
		for(i=index;i<top;i++)
		{
			Student[i]=Student[i+1];
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		for(i=0;i<top;i++)
		{
			int i;
			if(student[i]==student)
			{
				index=i;
			}
			for(i=index;i<top;i++)
			{
				Student[i]=Student[i+1];
			}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		int i;
		for(i=0;i<top;i++)
		{
			if(Student[i].birthDate==date)
			{
				System.out.println(Student[i]);
			}
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		for(i=0;i<top;i++)
		{
			if((Student[i].birthDate>firstDate)&&(Student[i].birthDtae<lastDate))
			{
				System,out,println(Student[i]);
			}
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		Date date=new Date();
		int i,min=date-Student[0].birthDate,ans;
		for(i=0;i<top;i++)
		{
			if((date-Student[i].birthDate)<=min)
			{
				ans=i;
			}
			System.out.println(ans);
		}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		int i=0;Date date=new Date();
		for(i=0;i<top;i++)
		{
			if(i==indexOfStudent)
			{
				System.out.println(date-Student[i].birthDate);
			}
		}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		int i;
		for(i=0;i<top;i++)
		{
			if((Student[i].birthDate)==age)
			{
				Student[i]=student;
			}
			System.out.println(student);
		}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double max=0;int i;
				for(i=0;i<top;i++)
				{
					if((Student[i].avgMark)>max)
						System.out.println(Student[i]);
				}
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i;
		for(i=0;i<top;i++)
		{
			if(Stdent[i]==student)
			{
				index=i;
			}
			System,out.println(Student[index+1]);
		}
		return null;
	}
}
