package com.uptc.prg3.datastruct.graph;

public abstract class AdjacencyMatrix <V,E>{
    private V[] vertex;
    private E[][] edges;
    private E empty;  

    public AdjacencyMatrix(V[] vertex, E[][] edges) {
        this.vertex = vertex;
        this.edges = edges;
    }
    
    public void setEmpty(E empty){
      this.empty = empty;
    }
    
//    public boolean isDirected(Comparator<E> comparator){
//      // to do
//      return false;
//    }
//    
//    public int gradeVertex(int index){
//        // to do ..
//       return 0;
//    }
//
//    public int gradeVertex(V vertex){
//        // todo 
//        // buscar el index de vertex y aplicar anterior..   
//     return 0;
//    }
//    
//    public int  getCountPaths(int indexHome, int indexTarget){
//      // to do 
//      return 0;
//    }
//    /**
//     * Retorna la lista de index de caminos potenciales ente un origen y un destino
//     * @param indexHome
//     * @param indexTarget
//     * @return 
//     */
//    public SimpleList<SimpleList <Integer>> getPaths(int indexHome, int indexTarget){
//      // to do 
//      return null;
//    }
//
//    public SimpleList<SimpleList <V>> getPaths(V home, V target){
//      // to do  antes hay que buscar el index de cada v...
//      return null;
//    }
//
//    /**
//     * Cual(es) es/son los caminos mas cortos....
//     * @param home
//     * @param target
//     * @return 
//     */
//    public SimpleList<SimpleList <V>> getShortPaths(V home, V target){
//      // to do ..
//      return null;
//    }
    
}
