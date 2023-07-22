/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;


/**
 *
 * @author miche
 */
public class Author {
    public ImageIcon smallPicture;
    public ImageIcon picture;
    public String name;
    public int birth;
    public int death;
    public String description;
    public Book[] books;
    
    public static final int smallImageWidth = 56;
    public static final int smallImageHeight = 80;
    public static final int imageWidth = 112;
    public static final int imageHeight = 160;
    
    private void load(String url) {
        try {
            BufferedImage base = ImageIO.read(getClass().getResource(url));
            int width = base.getWidth();
            int height = base.getHeight();
            {
                BufferedImage target = new BufferedImage(smallImageWidth, smallImageHeight, base.getType());
                Graphics drawer = target.getGraphics();
                drawer.drawImage(base, 0, 0, smallImageWidth, smallImageHeight, 0, 0, width, height, null);
                smallPicture = new ImageIcon(target);
            }
            {
                BufferedImage target = new BufferedImage(imageWidth, imageHeight, base.getType());
                Graphics drawer = target.getGraphics();
                drawer.drawImage(base, 0, 0, imageWidth, imageHeight, 0, 0, width, height, null);
                picture = new ImageIcon(target);
            }
        } catch (Exception ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public Author(String resource, String name, int birth, int death, String description, Book[] books) {
        if(resource != null) {
            load(resource);
        }
        this.name = name;
        this.birth = birth;
        this.death = death;
        this.description = description;
        this.books = books;
    }
    
    public static final Book[] jrrBooks = {new Book("The Lord of Rings", 1954,"Tolkein's epic high-fantansy magnum opus! Set in Middle-earth, the story began as a sequel to Tolkien's 1937 children's book The Hobbit, but eventually developed into a much larger work."), new Book("The Hobbit", 1937,"Also known as 'There and Back Again', this children's fantasy novel received wide critical acclaim, being nominated for the Carnegie Medal and awarded a prize from the New York Herald Tribune for best juvenile fiction."), new Book("Tree and Leaf: Including Mythopoeia", 1964, "This publication contains two of Tolkien's works: a revised version of an essay called 'On Fairy-Stories', and an allegorical short story called 'Leaf by Niggle'."), new Book("Farmer Giles of Ham", 1949, "This comidic fantasy fable describes the encounters between Farmer Giles and a wily dragon named Chrysophylax, and how Giles manages to use these to rise from humble beginnings to rival the king of the land."), new Book("The notion club papers", 1945, "This abandoned novel was written during 1945 and published posthumously in Sauron Defeated, the 9th volume of The History of Middle-earth. It is a time travel story, written while The Lord of the Rings was being developed."), new Book("The Road goes ever on", 1967, "This title encompasses several walking songs that J. R. R. Tolkien wrote for his Middle-earth legendarium. Within the stories, the original song was composed by Bilbo Baggins and recorded in The Hobbit."), new Book("Beowulf: The Monster and the Critics", 1936, "This was a lecture Tolkien gave on literary criticism, and on the Old English heroic epic poem Beowulf. It was first published as a paper in the Proceedings of the British Academy, and has since been reprinted in many collections."), new Book("Smith on Wootton Major", 1967, "This novella is Tolkien's only known completed publication after The Lord of Rings."), new Book("Goblin Feet", 1917, "This poem was written for Edith Mary Bratt, his wife-to-be. It celebrates the diminutive type of elf that Tolkien soon came to dislike, and he regretted having published the poem.")};
    private static final Book[] frankBooks = {new Book("Dune", 1965,"This epic science fiction novel was originally published as two separate serials in Analog magazine. It tied with Roger Zelazny's This Immortal for the Hugo Award in 1966 and it won the inaugural Nebula Award for Best Novel. It is the first installment of the Dune saga."),new Book("Dune Messiah", 1969,"The second of Herbert's six book Dune series, it was originally serialized in Galaxy magazine in 1969, and then published by Putnam the same year."), new Book("God Emperor of Dune", 1981, "The fourth in his Dune series of six novels, this novel was ranked as the No. 11 hardcover fiction best seller of 1981 by Publishers Weekly."), new Book("Children of Dune", 1976, "The third entry in the Dune series, this novel was originally serialized in Analog Science Fiction and Fact in 1976, and was the last Dune novel to be serialized before book publication."), new Book("Heretics of Dune", 1984, "The fifth entry in the Dune series, this novel was ranked as the No. 13 hardcover fiction best seller of 1984 by The New York Times."), new Book("Chapterhouse: Dune", 1985, "The last entry in the Dune series, this novel rose to No. 2 on The New York Times Best Seller list."), new Book("The Great Dune Trilogy", 1979, "The origanal publication of the Dune novel, which consisted of the first three serializations"), new Book("The White Plauge", 1982, "This science fiction novel explores madness and revenge on a global scale."), new Book("The Jesus Incident", 1979, "This science fiction novel is a sequel to Destination: Void, and has two sequels: The Lazarus Effect and The Ascension Factor."), new Book("The Godmakers", 1972, "The title of early editions of this science fiction novel was sometimes styled The God Makers.")};
    private static final Book[] robBooks = {new Book("The Eye of the World", 1990," This high-fantasy novel was the first book of The Wheel of Time series. It was published by Tor Books and released on 15 January 1990. The unabridged audiobook is read by Michael Kramer and Kate Reading."),new Book("The Dragon Reborn", 1991,"This high-fantasy novel is the third the Wheel of Time series, and was published by Tor Books. The unabridged audio book is read by Michael Kramer and Kate Reading. The Dragon Reborn consists of a prologue and 56 chapters."), new Book("The Great Hunt", 1990, "This novel is the second entry in the Wheel of Time series. It was published by Tor Books and released on November 15, 1990. The Great Hunt consists of a prologue and 50 chapters."), new Book("The Lord of Chaos", 1994, "The novel is the sixth entry in the Wheel of Time series. It was published by Tor Books and released on October 15, 1994, and was nominated for the Locus Award for Best Fantasy Novel in 1995. Lord of Chaos consists of a prologue, 55 chapters, and an epilogue."), new Book("The Shadow Rising", 1992, "This novel is the fourth entry in the Wheel of Time series. It was published by Tor Books and released on September 15, 1992. The unabridged audio book is read by Michael Kramer and Kate Reading."), new Book("Crossroads of Twilight", 2003, "This novel is the tenth entry in the Wheel of Time series. It was published by Tor Books."), new Book("The Fires of Heaven", 1993, "This novel is the fifth entry in the Wheel of Time series. It was published by Tor Books."), new Book("A Crown of Swords", 1996, "This novel is the seventh entry in the Wheel of Time series. It was published by Tor Books. A Crown of Swords consists of a prologue and 41 chapters."), new Book("The Path of Daggers", 1998, "This novel is eigth entry in the Wheel of Time series. It was published by Tor Books."), new Book("Winter's Heart", 2000, "This novel is the ninth entry in the Wheel of Time. It was published by Tor Books.")};
    private static final Book[] steigBooks = {new Book("Shrek!", 1990, "This comidic fantasy picture book is about a repugnant green monster who leaves home to see the world and ends up marrying an ugly princess."), new Book("Sylvester and the Magic Pebble", 1969, "This children's picture book received the Caldecott Medal in 1970."), new Book("Doctor De Soto", 1982, "This children's picture features a mouse dentist who must help a fox with a toothache without being eaten."), new Book ("Brave Irene", 1986, "This picture book tells the story of a dressmaker's daughter named Irene Bobbin. Irene Bobbin's mother isn't feeling well one day and is unable to deliver a ball gown she has made for a duchess, and the ball is that evening! Never fear though, because it is Irene the Brave to the rescue."), new Book("Amos & Boris", 1971, "Amos the mouse and Boris the whale are friends who have very little in common. Boris rescues Amos, who has set out to sail the seas - but might there be a time when Boris needs rescuing too? This picture book was an awardwinning fable and New York Times Best Illustrated Book of the Year"), new Book("Pete’s a Pizza", 1998, "Just when Pete is about to go out and play ball, it starts to rain. What's the quickest way to cheer him up? Turn him into a pizza, of course."), new Book("Abel’s Island", 1976, "This children's novel won a Newbery Honor. It was published by Farrar, Straus and Giroux, Toronto, Ontario in 1976. It is a survival story about a mouse stranded on an island."), new Book("Dominic", 1976, "This picture book details the Adventures of the Dominic the travelling dog."), new Book("The Amazing Bone", 1976, "This picture book was the first of Steig's few books in which the main character is a female. The book received the Caldecott Honor Award and was nominated for the Boston Globe-Horn Book Award for Picture Book."), new Book("CDB!", 1968, "This picutre books plays with language and sounds for a comidic reading experience.")};
    private static final Book[] shellBooks = {new Book("Frankenstein", 1818, "Also known as The Modern Prometheus, This novel tells the story of Victor Frankenstein, a young scientist who creates a sapient creature in an unorthodox scientific experiment."), new Book("The Last Man", 1826, "This apocalyptic, dystopian science fiction novel concerns Europe in the late 21st century, ravaged by the rise of a bubonic plague pandemic that rapidly sweeps across the entire globe, ultimately resulting in the near-extinction of humanity."), new Book("The Mortal Immortal", 1833, " This short story tells the tale of a man named Winzy, who drinks an elixir which makes him immortal. At first, immortality appears to promise him eternal tranquility, but soon the consequences of seeking immortality reveal themselves."), new Book("Valperga", 1832, "Also known as Life and Adventures of Castruccio, Prince of Lucca, this novel set amongst the wars of the Guelphs and Ghibellines."), new Book("Lodore", 1835, "Also published under the title The Beautiful Widow, Shelly's penultimate novel was completed by 1833 before being published two years later."), new Book("The Invisible Girl", 1832, "This Gothic tale was first published in The Keepsake for 1833. The tale is set in Wales, and tells the story of a young woman named Rosina, who lives with her guardian, Sir Peter Vernon, and is secretly engaged to his son, Henry."), new Book("Falkner", 1837, "This story was written as the same time as Lodore, and published a four whole years later. It charts a young woman's education under a tyrannical father figure."), new Book("History of a Six Week’s Tour", 1817, "With a full name of History of a 'Six Weeks' Tour through a part of France, Switzerland, Germany, and Holland', this travel narrative was a series of letters written by Mary, and her husband Percy Shelly, writer of the poem 'Ozymandias'."), new Book("The Fortunes of Perkin Warbeck", 1830, "This was a historical novel written by Shelly about Perkin Warbeck. The book takes a Yorkist point of view and proceeds from the conceit that Perkin Warbeck died in childhood and the supposed impostor was indeed Richard of Shrewsbury.")};
    private static final Book[] wollBooks = {new Book("A Vindication of the Rights of Woman: with Strictures on Political and Moral Subjects", 1792, "This book was one of the earliest written and published texts of feminist philosophy."), new Book("Letters Written During a Short Residence in Sweden, Norway, and Denmark", 1796, "Wollstonecraft's travel narrative consists of 25 letters written during her travels. They deatail topics like the sociopolitical climate of each country, and existential contemplations by Wollstonecraft made during international trip across Europe."), new Book("A Vindication of the Rights of Men", 1790, "This text was taken from a letter by Wollstonecraft to Right Honourable Edmund Burke during the French Revolution, and it attacks aristocracy and advocates republicanism."), new Book("Mary: A Fiction", 1788, "Wollstonecraft's only completed novel, this book tells the tragic story of a female's successive 'romantic friendships' with a woman and a man."), new Book("Original Stories from Real Life", 1788, "Wollstonecraft's only completed work of children's literature, this novel has a core theme of leaving behind childish imperfections to become a fully capable and responsible adult."), new Book("Thoughts on the Education of Daughters", 1787, "This novel was created to prepare middle class women to entering the education system they had only recently been given the right to join."), new Book("An Historical and Moral View of the Origin and Progress of the French Revolution", 1794, "This work has been selected by scholars as being culturally important, and is part of the knowledge base of civilization as we know it. It has been considered an artical of the knowledge of history at large.")};
    private static final Book[] woolfBooks = {new Book("Mrs Dalloway", 1925, "Mrs. Dalloway is a novel by Virginia Woolf published on 14 May 1925. It details a day in the life of Clarissa Dalloway, a fictional upper-class woman in post-First World War England. It is one of Woolf's best-known novels. The working title of Mrs. Dalloway was The Hours."), new Book("A Room of One's Own", 1929, "A Room of One's Own is an extended essay by Virginia Woolf, first published in September 1929. The work is based on two lectures Woolf delivered in October 1928 at Newnham College and Girton College, women's colleges at the University of Cambridge."), new Book("To the Lighthouse", 1927, "To the Lighthouse is a 1927 novel by Virginia Woolf. The novel centres on the Ramsay family and their visits to the Isle of Skye in Scotland between 1910 and 1920."), new Book("Orlando: A Biography", 1928, "a novel by Virginia Woolf, first published on 11 October 1928. Inspired by the tumultuous family history of the aristocratic poet and novelist Vita Sackville-West, Woolf's lover and close friend, it is arguably one of her most popular novels; Orlando is a history of English literature in satiric form. The book describes the adventures of a poet who changes sex from man to woman and lives for centuries, meeting the key figures of English literary history. Considered a feminist classic, the book has been written about extensively by scholars of women's writing and gender and transgender studies."), new Book("The Waves", 1931, "The Waves is a 1931 novel by English novelist Virginia Woolf. It is critically regarded as her most experimental work, consisting of ambiguous and cryptic soliloquies spoken mainly by six characters: Bernard, Susan, Rhoda, Neville, Jinny and Louis."), new Book("A Haunted House and Other Short Stories", 1921, "A Haunted House is a 1944 collection of 18 short stories by Virginia Woolf. It was produced by her husband Leonard Woolf after her death although in the foreword he states that they had discussed its production together."), new Book("Flush: A Biography", 1933, "Flush: A Biography, an imaginative biography of Elizabeth Barrett Browning's cocker spaniel, is a cross-genre blend of fiction and nonfiction by Virginia Woolf published in 1933."), new Book("The Years", 1937, "The Years is a 1937 novel by Virginia Woolf, the last she published in her lifetime. It traces the history of the Pargiter family from the 1880s to the \"present day\" of the mid-1930s. Although spanning fifty years, the novel is not epic in scope, focusing instead on the small private details of the characters' lives."), new Book("The Voyage Out", 1915, "The Voyage Out is the first novel by Virginia Woolf, published in 1915 by Duckworth."), new Book("Jacob's Room", 1922, "Jacob's Room is the third novel by Virginia Woolf, first published on 26 October 1922. The novel centres, in a very ambiguous way, around the life story of the protagonist Jacob Flanders and is presented almost entirely through the impressions other characters have of Jacob.")};
    
    
    
   
    
    public static final Author[] AUTHORS = {
        new Author("/authorpictures/Tolkien.jpg", "J.R.R. Tolkein", 1892, 1973, "John Ronald Reuel Tolkien CBE FRSL was an English writer and philologist. He was the author of the high fantasy works The Hobbit and The Lord of the Rings.", jrrBooks),
        new Author("/authorpictures/Herbert.jpg", "Frank Herbert", 1920, 1986, "Franklin Patrick Herbert Jr. was an American science fiction author best known for the 1965 novel Dune and its five sequels.", frankBooks),
        new Author("/authorpictures/Jordan.jpg","Robert Jordan", 1948, 2007, "James Oliver Rigney Jr., better known by his pen name Robert Jordan, was an American author of epic fantasy.", robBooks),
        new Author("/authorpictures/Steig.jpg","William Steig", 1930, 2003, "William Steig was an American cartoonist, illustrator and writer of children's books, best known for the picture book Shrek!, which inspired the film series of the same name.", steigBooks),
        new Author("/authorpictures/Shelly.jpg","Mary Shelly", 1797, 1851, "Mary Wollstonecraft Shelley was an English novelist who wrote the Gothic novel Frankenstein; or, The Modern Prometheus, which is considered an early example of science fiction and one of her best-known works.", shellBooks),
        new Author("/authorpictures/Wollstonecraft.jpg","Mary Wollstonecraft", 1759, 1797, "Mary Wollstonecraft was a British writer, philosopher, and advocate of women's rights.", wollBooks),
        new Author("/authorpictures/Woolf.jpg", "Virginia Woolf", 1882, 1941, "Adeline Virginia Woolf was an English writer. She is considered one of the most important modernist 20th-century authors and a pioneer in the use of stream of consciousness as a narrative device.", woolfBooks),
        
        
        
        
    };
}