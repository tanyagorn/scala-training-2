object StringUtils {

  def splitWordsToArray(words: String): Array[String] = {
    words.split("\\s")
  }

  def findLongestWord(words: String): String = {
    val array = splitWordsToArray(words)
    array.maxBy(_.length)
  }

  def findMostCommonWord(words: String): String = {
    val array = splitWordsToArray(words)
    array.groupMapReduce(_.toLowerCase)(_ => 1)(_ + _).maxBy(_._2)._1
  }

  def findMostCommonLetter(words: String) : Char = {
    val wordsWithoutSpaces = words.replaceAll("\\s", "")
    wordsWithoutSpaces.groupMapReduce(_.toLower)(_ => 1)(_ + _).maxBy(_._2)._1
  }

  /*
  First step consists in getting an array of tuples representing for each character
  which word it comes from. This can be achieved by first splitting the sentence in words
  and for each character of each word producing a tuple with the character and its word
  (.map(w => w.map(c => c -> w))). And since this gives us an array of arrays,
  we can use a flatMap to flatten these into a one level array of tuples
  (producing Array((t,this), (h,this), (i,this), ...)).

  Second step consists in grouping these tuples of characters and words by character
  and mapping the grouped values to the associated words.
  Which can be achieved with groupMap (it groups tuples by their first part (by character)
  and maps grouped tuples to their second part (the word)).
   */
  def createMapOfLetterToWordAppear(words: String) : Map[Char, Array[String]]  = {
    val array = splitWordsToArray(words)
    array.flatMap(word => word.map(char => char -> word)).groupMap(_._1)(_._2)
  }

}