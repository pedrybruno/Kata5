package kata5;

public interface AtributeExtractor<E , A> {
    
    public A extract(E entity);
    
}