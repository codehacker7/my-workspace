import java.io.Serializable;
import java.util.Iterator;

public class AnimalList implements Serializable,Iterable<Animal> {

	
AnimalNode<AnimalList> head,tail;
private int size;

public int size() {
	return size;
	}
		
public boolean isEmpty() {
	return size==0;
	}
		
		
public void addFirst(Animal animal) {
AnimalNode<AnimalList> n = new AnimalNode<>(animal);
	if(isEmpty()) {
		head = tail = n;
		}
	else{
		n.next = head;
		head = n;
		}
size++;
			
}

public void addLast(Animal animal) {
		
AnimalNode<AnimalList> n = new AnimalNode<>(animal);
if(isEmpty())
	head = tail = n;
else{
		
	tail.next = n;
	tail = n; //tail = tail.next;
	}
	size++;
			
			
}
public void add(int index,Animal animal) {
			
if(index < 0 || index > size)
	throw new IndexOutOfBoundsException();
else if(index == 0)
	addFirst(animal);
else if(index == size)
	addLast(animal);
else{
	AnimalNode<AnimalList> node = new AnimalNode<>(animal);
	AnimalNode<AnimalList> current = head;
	for (int i = 0; i < index-1; i++)
		current = current.next;
		node.next = current.next;
		current.next = node;
		size++;
	}
}
public Animal removeFirst() {
	
if(isEmpty())
	return null;
				
else{
	AnimalNode<AnimalList> temp = head;
	head = head.next;

		if(head == null) 
				tail = null;
	size--;
	return temp.element;
			
}
}
		
public Animal removeLast() {
			
			
if(isEmpty())
	return null;

else if(size == 1)
	return removeFirst();

else{ 

	AnimalNode<AnimalList> temp = tail;
			
	AnimalNode<AnimalList> current = head;
	
	for (int i = 0; i < size-2; i++)
			current = current.next;
				
	tail = current;
	tail.next = null;
	size--;
	return temp.element;
			
}
			
}

public Animal remove(int index) {
			
	
if(index < 0 || index > size-1)
	throw new IndexOutOfBoundsException();

else if(index == 0)
	return removeFirst();
				
else if (index == size-1)
	return removeLast();
				
else{
	AnimalNode<AnimalList> prev = head;
				
	for (int i = 0; i < index-1; i++)
		prev = prev.next;
				
	AnimalNode<AnimalList> current = prev.next;
	prev.next = current.next;
	size--;
	return current.element;
}
			
}

public Animal getFirst() {
			
if(isEmpty()) {
	return null;
}

else {
	return head.element;
}
			
		
}
		
public Animal getLast() {
			
if(isEmpty()) {
	return null;
}
			
else {
	return tail.element;
				
}
			
}		
		
public Animal get(int index) {
			
if(index<0 || index>=size) {
	throw new IndexOutOfBoundsException();
}
			
else if(index==0) {
	return getFirst();
}
			
else if(index ==size-1) {
	return getLast();
}
else {
	AnimalNode<AnimalList> curry = head;
				
	for(int i=0;i<index;i++) {
		curry = curry.next;
}
				
					
	if(curry==null) {
		return null;
		}
	else {
		return curry.element;
		}
	
	}

}

public Animal set(int index,Animal animal) {
			
if(index<0 || index>size-1) {
	throw new IndexOutOfBoundsException();
}
if(head==null) {
	
AnimalNode<AnimalList> newNode = new AnimalNode<>(animal);
head = tail =newNode;
return head.element;
	         	
}
			
if(index==0) {
				
AnimalNode<AnimalList> current =  head;
AnimalNode<AnimalList> newNode = new AnimalNode<>(animal);

newNode.next = current.next;
head = newNode;
				
return head.element;
				
				
}
			
else {
		
AnimalNode<AnimalList> current =  head;
AnimalNode<AnimalList> newNode = new AnimalNode<>(animal);
				
				
				
for(int i=0;i<index-1;i++) {
	current = current.next;
}
				
AnimalNode<AnimalList> replacable = current.next;
				
newNode.next = replacable.next;
current.next = newNode;
				
	return replacable.element;
				
				}
			
			
			
}
		
public String toString() {
			
if(head ==null || tail==null) {
	return null;
}
else {
			
AnimalNode<AnimalList> current = head;
			
Animal c = current.element;
	
String s ="";
			
for(int i=0;i<size;i++) {
	s = s+ c.toString()+"\n";
	if(current!=null)
		current = current.next;
	if(current!=null)
		c = current.element;
}
return s;
		}
}
		

public AnimalList getHungryAnimals() {
			
AnimalList list2 = new AnimalList();	
		
int q=0;

AnimalNode<AnimalList> x = head;
	
for(int i=0;i<size();i++) {
	
	if(x.element.getEnergy()<50)		
			list2.add(q++, x.element);
				x= x.next;
}
		return list2;
}
			
			
public AnimalList getStarvingAnimals() {
				
AnimalList list4 = new AnimalList();	
			
int q=0;
				
AnimalNode<AnimalList> x = head;
			
for(int i=0;i<size();i++) {
			
	if(x==null) {
		return null;
}
	else if(x.element.getEnergy()<17  )		
		list4.add(q++, x.element);
				
	   x= x.next;
					
}
				
				
	return list4;
					
}
				
public AnimalList getAnimalsInBarn()			{
				
MyIterator c = (AnimalList.MyIterator) iterator();
			
			
AnimalList list = new AnimalList();	
int q=0;
int check =0;
	
while(c.hasNext()) {
		if((c.next().getX()==450 && c.next().getY()==50) || (c.next().getX()==550 && c.next().getY()==150)) {
			check++;	
		list.add(q++,c.next());
	}
		}
				
if(check==0) {
	return null;
}
else {
	return list;
}
			
}

public double getRequiredFood() {
			
MyIterator c = (AnimalList.MyIterator) iterator();
			
double requiredfood =0;
			
while(c.hasNext()) {
	Animal q = c.next();
	double x = q.getEnergy();
	if(x<100) {
		double tobeadded = 100-x;
		requiredfood+=tobeadded;
					
}
}
			
return requiredfood;
			
}
		
		
		
	
		
//		public int getByType(Class  Animal) {
//
//	
//			AnimalNode<AnimalList> animal = head;
//			int num =0;
//			for(int i=0;i<size();i++) {
//				if(animal.element instanceof  Cow) {
//					System.out.println("here is testing: "+Animal);
//					num++;
//				}
//				animal = animal.next;
//			}
//
//	
//
//			
//		return num;
//	
//		}
			
	
private class AnimalNode<AnimalList> implements Serializable{
		
Animal element;
AnimalNode<AnimalList> next;
		
public AnimalNode(Animal e) {
	element = e;
			
}
}

@Override
	
public Iterator<Animal> iterator() {
// TODO Auto-generated method stub
		
	return new MyIterator();	
}

public class MyIterator implements Iterator<Animal>{
		
AnimalNode<AnimalList> current = head;
	
public boolean hasNext() {
			// TODO Auto-generated method stub
	return (current!=null);
}

@Override

public Animal next() {
			// TODO Auto-generated method stub

AnimalNode<AnimalList> temp = current;
	
current = current.next;
		
	return temp.element;
	}
}

}
