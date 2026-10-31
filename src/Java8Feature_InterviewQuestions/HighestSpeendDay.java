package Java8Feature_InterviewQuestions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//From a List of Transactions Find the day with the highest total spend
public class HighestSpeendDay {
	public static void main(String[] args) {
		List<Transaction> transaction = Arrays.asList(
				new Transaction("T1", LocalDate.of(2024, 1, 1), 300),
				new Transaction("T2", LocalDate.of(2024, 1, 1), 200),
				new Transaction("T3", LocalDate.of(2024, 1, 2), 500),
				new Transaction("T4", LocalDate.of(2024, 1, 2), 300),
				new Transaction("T5", LocalDate.of(2024, 1, 3), 100)
		);
		
		//Day with the highest Spending:2024-01-02 
//		Total spending : 800.0
		
		System.out.println(
				transaction.stream()
				.collect(Collectors.groupingBy(x->x.getDate(),Collectors.summingDouble(x->x.getAmount())))
				.entrySet().stream()
				.sorted((x,y)->Double.compare(y.getValue(), x.getValue()))
				.findFirst().get()
				
		);
	}
}

class Transaction{
	
	private String id;
	private LocalDate date;
	private double amount;
	
	public Transaction(String id, LocalDate date, double amount) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, date, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(date, other.date) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", amount=" + amount + "]";
	}
	
	
}