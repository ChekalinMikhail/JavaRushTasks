package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'o', 'e', 'e', 'e', 'l', 'e'},
                {'n', 's', 'n', 'n', 'n', 'o'},
                {'e', 'e', 'n', 'o', 'n', 'e'},
                {'m', 'm', 'n', 'n', 'n', 'h'},
                {'p', 'e', 'e', 'e', 'j', 'e'},
        };
        List<Word> words = (detectAllWords(crossword, "one"));
        for (Word word : words) {
            System.out.println(word);
        }

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> result = new ArrayList<>();
        for (String s : words) { //перебираем все слова переданные в качестве аргумента в метод
            char[] wordToChar = s.toCharArray();
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {
                    if (crossword[i][j] == (int) wordToChar[0]) { //ищем совпадение по первой букве для каждого слова в crossword
                        for (Word word : checkLines(i, j, wordToChar, crossword)) { //получаем список слов длинна которых идентична искомому во всех направлениях
                            if (word != null && s.equals(word.text))  //проверяем равно ли каждое слово из списка искомому, в итоговый список добавляются все слова присутствующие в кроссворде и равные искомому
                                result.add(word);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<Word> checkLines(int i, int j, char[] wordToChar, int[][] crossword) {
        List<Word> result = new ArrayList<>();

        try { //слово вниз по вертикали
            StringBuilder line1 = new StringBuilder();
            line1.append((char) crossword[i][j]);
            int iNext = i;
            for (int k = 1; k < wordToChar.length; k++) {
                iNext++;
                line1.append((char) crossword[iNext][j]);
            }
            Word word1 = new Word(line1.toString());
            word1.setStartPoint(j, i);
            word1.setEndPoint(j, iNext);
            result.add(word1);
        } catch (IndexOutOfBoundsException ignored) {
            result.add(null);
        }

        try { //слово вверх по вертикали
            StringBuilder line2 = new StringBuilder();
            line2.append((char) crossword[i][j]);
            int iNext = i;
            for (int k = 1; k < wordToChar.length; k++) {
                iNext--;
                line2.append((char) crossword[iNext][j]);
            }
            Word word2 = new Word(line2.toString());
            word2.setStartPoint(j, i);
            word2.setEndPoint(j, iNext);
            result.add(word2);
        } catch (IndexOutOfBoundsException ignored) {
            result.add(null);
        }

        try { //слово вправо по горизонтали
            StringBuilder line3 = new StringBuilder();
            line3.append((char) crossword[i][j]);
            int jNext = j;
            for (int k = 1; k < wordToChar.length; k++) {
                jNext++;
                line3.append((char) crossword[i][jNext]);
            }
            Word word3 = new Word(line3.toString());
            word3.setStartPoint(j, i);
            word3.setEndPoint(jNext, i);
            result.add(word3);
        } catch (IndexOutOfBoundsException ignored) {
            result.add(null);
        }

        try { //слово влево по горизонтали
            StringBuilder line4 = new StringBuilder();
            line4.append((char) crossword[i][j]);
            int jNext = j;
            for (int k = 1; k < wordToChar.length; k++) {
                jNext--;
                line4.append((char) crossword[i][jNext]);
            }
            Word word4 = new Word(line4.toString());
            word4.setStartPoint(j, i);
            word4.setEndPoint(jNext, i);
            result.add(word4);
        } catch (IndexOutOfBoundsException ignored) {
            result.add(null);
        }

        try { //слово вверх вправо по диагонали
            StringBuilder line5 = new StringBuilder();
            line5.append((char) crossword[i][j]);
            int jNext = j;
            int iNext = i;
            for (int k = 1; k < wordToChar.length; k++) {
                jNext++;
                iNext--;
                line5.append((char) crossword[iNext][jNext]);
            }
            Word word5 = new Word(line5.toString());
            word5.setStartPoint(j, i);
            word5.setEndPoint(jNext, iNext);
            result.add(word5);
        } catch (IndexOutOfBoundsException ignored) {
            result.add(null);
        }

        try { //слово вниз вправо по диагонали
            StringBuilder line6 = new StringBuilder();
            line6.append((char) crossword[i][j]);
            int jNext = j;
            int iNext = i;
            for (int k = 1; k < wordToChar.length; k++) {
                jNext++;
                iNext++;
                line6.append((char) crossword[iNext][jNext]);
            }
            Word word6 = new Word(line6.toString());
            word6.setStartPoint(j, i);
            word6.setEndPoint(jNext, iNext);
            result.add(word6);
        } catch (IndexOutOfBoundsException ignored) {
            result.add(null);
        }

        try { //слово вниз влево по диагонали
            StringBuilder line7 = new StringBuilder();
            line7.append((char) crossword[i][j]);
            int jNext = j;
            int iNext = i;
            for (int k = 1; k < wordToChar.length; k++) {
                jNext--;
                iNext++;
                line7.append((char) crossword[iNext][jNext]);
            }
            Word word7 = new Word(line7.toString());
            word7.setStartPoint(j, i);
            word7.setEndPoint(jNext, iNext);
            result.add(word7);
        } catch (IndexOutOfBoundsException ignored) {
            result.add(null);
        }

        try { //слово вверх влево по диагонали
            StringBuilder line8 = new StringBuilder();
            line8.append((char) crossword[i][j]);
            int jNext = j;
            int iNext = i;
            for (int k = 1; k < wordToChar.length; k++) {
                jNext--;
                iNext--;
                line8.append((char) crossword[iNext][jNext]);
            }
            Word word8 = new Word(line8.toString());
            word8.setStartPoint(j, i);
            word8.setEndPoint(jNext, iNext);
            result.add(word8);
        } catch (IndexOutOfBoundsException ignored) {
            result.add(null);
        }
        return result;
    }

    public static class Word {
        private final String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
