package HolidayProjects;

import java.util.Arrays;
import java.util.Scanner;

public class personalityTest {

    public static int questionNumber = 1;
    private static String name;
    public static String[] result = new String[4];


        public static void main(String[] args) {
            Scanner input = new  Scanner(System.in);
            System.out.println("What is your name: ");
            name = input.nextLine();

            String[] extroversionVsIntroversionTest = {
                    "A. expend energy, enjoy groups. B. conserve energy, enjoy one-on-one",
                    "A. more outgoing, think out loud. B. more reserved, think to yourself",
                    "A. seek many tasks, public activities, interaction with others. " +
                            "B. seek private solitary activities with quiet to concentrate",
                    "A. external, communicative,  express yourself. B. internal, reticent, keep to yourself",
                    "A. active, initiate. B. reflective, deliberate"};

            String[] sensingVsIntuitionTest = {
                    "A. interpret literally. B. look for meaning and possibilities",
                    "A. practical, realistic, experiential. B. imaginative, innovative, theoretical",
                    "A. standard, usual, conventional. B. different, novel, unique",
                    "A. focus on here-and-now\" .B.look to the future, global perspective, \"big picture\"",
                    "A. facts, things, \"what is\". B. ideas, dreams, \"what could be,\" philosophical"
            };

            String[] thinkingVsFeelingTest = {
                    "A. logical, thinking, questioning. B. empathetic, feeling, accommodating",
                    "A. candid, straight forward, frank. B.tactful, kind, encouraging",
                    "A. firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate",
                    "A. tough-minded, just B.tender-hearted, merciful",
                    "A. matter of fact, issue-oriented B. sensitive, people-oriented, compassionate",
            };

            String[] judgingVsPerceivingTest = {
                    "A. organized, orderly. B. flexible, adaptable",
                    "A. plan, schedule B. unplanned, spontaneous",
                    "A. regulated, structured B. easygoing, “live\" and “let live\"",
                    "A. preparation, plan ahead. B. go with the flow, adapt as you go",
                    "A. control, govern B. latitude, freedom"};

            int[] extrovertVsIntrovertAnswersStorage = new int[5];
            int[] sensingVsIntuitionsAnswersStorage = new int[5];
            int[] thinkingVsFeelingAnswersStorage = new int[5];
            int[] judgingVsPerceivingAnswersStorage = new int[5];

            iterate(extroversionVsIntroversionTest,extrovertVsIntrovertAnswersStorage);
            iterate(sensingVsIntuitionTest,sensingVsIntuitionsAnswersStorage);
            iterate(thinkingVsFeelingTest,thinkingVsFeelingAnswersStorage);
            iterate(judgingVsPerceivingTest,judgingVsPerceivingAnswersStorage);

            int sumOfAsInExtroversion = sum(extrovertVsIntrovertAnswersStorage);
            int sumOfAsInSensing = sum(sensingVsIntuitionsAnswersStorage);
            int sumOfAsInThinking = sum(thinkingVsFeelingAnswersStorage);
            int sumOfAsInJudging = sum(judgingVsPerceivingAnswersStorage);

            // append personality type accordingly

            if (sumOfAsInExtroversion < 3) result[0] = "I";
            else {
                result[0]= "E";
            }

            if (sumOfAsInSensing < 3) result[1] = "N";
            else {
                result[1] = "S";
            }

            if (sumOfAsInThinking < 3) result[2] ="F";
            else {
                result[2] = "T";
            }

            if(sumOfAsInJudging < 3) result[3] = "P";
            else{
                result[3] = "J";
            }


            // print personality results in a table.
            System.out.printf("%nHello %s you selected%n\n", name);
            System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "A", "B",
                    " ", "A", "B", " ", "A", "B", " ", "A", "B");
            int numbering = 1;
            System.out.printf("%s%n", "-".repeat(74));
            for (int i = 0; i< extrovertVsIntrovertAnswersStorage.length; i++) {
                System.out.printf("|%5d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s |%n", numbering++,
                        placeCheckmark(extrovertVsIntrovertAnswersStorage[i],1),
                        placeCheckmark(extrovertVsIntrovertAnswersStorage[i], 2),
                        numbering++, placeCheckmark(sensingVsIntuitionsAnswersStorage[i], 1),
                        placeCheckmark(sensingVsIntuitionsAnswersStorage[i], 2),
                        numbering++,
                        placeCheckmark(thinkingVsFeelingAnswersStorage[i], 1),
                        placeCheckmark(thinkingVsFeelingAnswersStorage[i], 2), numbering++,
                        placeCheckmark(judgingVsPerceivingAnswersStorage[i], 1),
                        placeCheckmark(judgingVsPerceivingAnswersStorage[i], 2));
            }

            System.out.printf("%s%n", "-".repeat(74));
            System.out.printf("|%5s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d |%n", "TOTAL",
                    countNumbers(extrovertVsIntrovertAnswersStorage, 1), countNumbers(extrovertVsIntrovertAnswersStorage, 0),
                    " ", countNumbers(sensingVsIntuitionsAnswersStorage, 1), countNumbers(sensingVsIntuitionsAnswersStorage, 0), " ",
                    countNumbers(thinkingVsFeelingAnswersStorage, 1),
                    countNumbers(thinkingVsFeelingAnswersStorage, 0), " ",
                    countNumbers(judgingVsPerceivingAnswersStorage, 1), countNumbers(judgingVsPerceivingAnswersStorage, 0));
            System.out.printf("%s%n", "-".repeat(74));
            System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "E", "I",
                    " ", "S", "N", " ", "T", "F", " ", "J", "P");
            System.out.println();
            System.out.println("Your personality type is " + Arrays.toString(result));
            System.out.println("For your personality interpretation, press 1 or 2 to exit: ");
            int interpret = input.nextInt();

            if (interpret == 1) interpretation();
            else System.exit(1);

        }

    private static void interpretation() {

        String[] infp = {"I","N","F","P"};
        String[] intj = {"I","N","T","J"};
        String[] infj = {"I","N","F","J"};
        String[] intp = {"I","N","T","P"};
        String[] enfp = {"E","N","F","P"};
        String[] entj = {"E","N","T","J"};
        String[] entp = {"E","N","T","P"};
        String[] enfj = {"E","N","F","J"};
        String[] isfj = {"I","S","F","J"};
        String[] isfp = {"I","S","F","P"};
        String[] istj = {"I","S","T","J"};
        String[] istp = {"I","S","T","P"};
        String[] esfj = {"E","S","F","J"};
        String[] esfp = {"E","S","F","P"};
        String[] estj = {"E","S","J","J"};
        String[] estp = {"E","S","T","P"};

        if (Arrays.equals(result, infp)) System.out.println("""
                        INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer,
                        possibilities are paramount; the realism of the moment is only of passing concern. 
                        They see potential for a better future, and pursue truth and meaning with their own individual flair.
                                                
                        INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal growth of themselves and others.
                        Individualistic and nonjudgmental, INFPs believe that each person must find their own path. 
                        They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same.
                        INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.
                        
                What does INFP stand for?
                
                INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
                creators of the Myers-Briggs Type Indicator (MBTI®). INFP stands for Introversion, iNtuition, Feeling, and Perceiving, 
                which are four core personality traits based on the work of psychologist C.G. Jung.
                                 
                Each of the four letters of the INFP code signifies a key personality trait of this type. INFPs are energized by time alone (Introverted),
                focus on ideas and concepts rather than facts and details (iNtuitive), make decisions based on feelings and values (Feeling), 
                and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).
                                        
                The INFP personality type is also called the "Healer" because of their sympathetic idealism and gentle compassion for other people.
                Other nicknames for the INFP include:
                        """);

        else if (Arrays.equals(result, intj)) {
            System.out.println("""
                    The INTJ Personality Type
                    INTJs are analytical problem-solvers, eager to improve systems and processes with their innovative ideas. 
                    They have a talent for seeing possibilities for improvement, whether at work, at home, or in themselves.
                                        
                    Often intellectual, INTJs enjoy logical reasoning and complex problem-solving. 
                    They approach life by analyzing the theory behind what they see, and are typically focused inward, 
                    on their own thoughtful study of the world around them. INTJs are drawn to logical systems and are much less comfortable 
                    with the unpredictable nature of other people and their emotions. They are typically independent and selective about 
                    their relationships, preferring to associate with people who they find intellectually stimulating.
                                        
                    What does INTJ stand for?
                    INTJ is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator
                    (MBTI®). INTJ stands for Introverted, iIntuitive, Thinking, Judging, 
                    which are four core personality traits based on the work of psychologist C.G. Jung.
                                        
                    Each of the four letters of the INTJ code signifies a key personality trait of this type. INTJs are energized by time alone (Introverted),
                    focus on ideas and concepts rather than facts and details (iIntuitive), make decisions based on logic and reason (Thinking) 
                    and prefer to be planned and organized rather than spontaneous and flexible (Judging).""");
        }
        else if (Arrays.equals(result, infj)) {
            System.out.println("""
                    The INFJ Personality Type
                    INFJs are thoughtful nurturers with a strong sense of personal integrity and a drive to help others realize their potential. 
                    Creative and dedicated, they have a talent for helping others with original solutions to their personal challenges.
                                        
                    The Counselor has a unique ability to intuit others' emotions and motivations, and will often know how someone else is feeling 
                    before that person knows it himself. They trust their insights about others and have strong faith in their ability to read people. 
                    Although they are sensitive, they are also reserved; the INFJ is a private sort, and is selective about sharing intimate thoughts 
                    and feelings.
                                        
                    INFJs search for meaning and purpose in their lives and in the outer world. They tend to have an immense interest in deeply understanding culture, 
                    society, and the universe as a whole. INFJs naturally see how every thought or action could potentially have important consequences, 
                    either positive or negative. This reflective and curious worldview gives INFJs a unique perspective and thoughtful approach to how they interact 
                    with others and the world around them.
                                        
                    Ultimately, INFJs seek to turn their abstract and intellectual musings into concrete actions that can be applied and make a transformative impact 
                    on others. Although it is common for INFJs to get stuck in their heads and struggle with taking action, when they are at their best, their actions 
                    are aligned with their authentic values.
                                        
                    What does INFJ stand for?
                    INFJ is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®).\s
                                        
                    Each of the four letters of the INFJ code signifies a key personality trait of this type. The letters INFJ stand for the following dimensions of 
                    personality, based on the work of psychologist C.G. Jung:
                                        
                    Introverted: INFJs are energized by time alone\s
                    iNtuitive: INFJs focus on ideas and concepts rather than facts and details\s
                    Feeling: INFJs make decisions based on feelings and values\s
                    Judging: INFJs prefer to be planned and organized rather than spontaneous and flexible\s""");
        }
        else if (Arrays.equals(result, intp)) {
            System.out.println("""
                    The INTP Personality Type
                    INTPs are philosophical innovators, fascinated by logical analysis, systems, and design. They are preoccupied with theory, and search for the 
                    universal law behind everything they see. They want to understand the unifying themes of life, in all their complexity.
                                        
                    INTPs are detached, analytical observers who can seem oblivious to the world around them because they are so deeply absorbed in thought. 
                    They spend much of their time in their own heads: exploring concepts, making connections, and seeking understanding of how things work. 
                    To the Architect, life is an ongoing inquiry into the mysteries of the universe.
                                        
                    What does INTP stand for?
                    INTP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). 
                    INTP stands for Introverted, iIntuitive, Thinking, Perceiving, which are four core personality traits based on the work of psychologist C.G. Jung.
                                        
                    The INTP type describes a person who is energized by time alone (Introverted), who focuses on ideas and concepts rather than facts and details (iIntuitive), 
                    who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving).""");
        } else if (Arrays.equals(result, enfp)) {
            System.out.println("""
                    The ENFP Personality Type
                    ENFPs are people-centered creators with a focus on possibilities and a contagious enthusiasm for new ideas, people and activities. 
                    Energetic, warm, and passionate, ENFPs love to help other people explore their creative potential.
                                        
                    ENFPs are typically agile and expressive communicators, using their wit, humor, and mastery of language to create engaging stories. 
                    Imaginative and original, ENFPs often have a strong artistic side. They are drawn to art because of its ability to express inventive ideas and create a deeper 
                    understanding of human experience.
                                        
                    What does ENFP stand for?
                    ENFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). 
                    ENFP stands for Extraversion, iNtuition, Feeling, and Perceiving, which are four core personality traits based on the work of psychologist C.G. Jung.
                                        
                    Each of the four letters of the ENFP code signifies a key personality trait of this type. ENFPs are energized by time spent with others (Extraverted), 
                    focus on ideas and concepts rather than facts and details (iNtuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous and 
                    flexible rather than planned and organized (Perceiving).
                                        
                    The ENFP personality type is also called the "Champion" because of this type's enthusiasm for helping others realize their dreams. Other nicknames 
                    for the ENFP include:
                                        
                    The Imaginative Motivator (MBTI)
                    The Campaigner (16Personalities)""");
        } else if (Arrays.equals(result, entj)) {
            System.out.println("""
                    The ENTJ Personality Type
                    ENTJs are strategic leaders, motivated to organize change. They are quick to see inefficiency and conceptualize new solutions, 
                    and enjoy developing long-range plans to accomplish their vision. They excel at logical reasoning and are usually articulate and quick-witted.
                                        
                    ENTJs are analytical and objective, and like bringing order to the world around them. When there are flaws in a system, the ENTJ sees them, 
                    and enjoys the process of discovering and implementing a better way. ENTJs are assertive and enjoy taking charge; they see their role as that of leader 
                    and manager, organizing people and processes to achieve their goals.
                                        
                    What does ENTJ stand for?
                    ENTJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Extraverted, 
                    iIntuitive, Thinking, Judging. ENTJ indicates a person who is energized by time spent with others (Extraverted), who focuses on ideas and concepts 
                    rather than facts and details (iIntuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized 
                    rather than spontaneous and flexible (Judging). ENTJs are sometimes referred to as Commander personalities because of their innate drive to lead 
                    others.""");
        } else if (Arrays.equals(result, entp)) {
            System.out.println("""
                    The ENTP Personality Type
                    ENTPs are inspired innovators, motivated to find new solutions to intellectually challenging problems. They are curious and clever, and seek to comprehend 
                    the people, systems, and principles that surround them. Open-minded and unconventional, Visionaries want to analyze, understand, and influence other people.
                     
                    ENTPs enjoy playing with ideas and especially like to banter with others. They use their quick wit and command of language to keep the upper hand with other people, 
                    often cheerfully poking fun at their habits and eccentricities. While the ENTP enjoys challenging others, in the end they are usually happy to live and let live. 
                    They are rarely judgmental, but they may have little patience for people who can't keep up.
                         
                    What does ENTP stand for?
                    ENTP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Extraverted, 
                    iIntuitive, Thinking, Perceiving. ENTP indicates a person who is energized by time spent with others (Extraverted), who focuses on ideas and concepts 
                    rather than facts and details (iIntuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible 
                    rather than planned and organized (Perceiving). ENTPs are sometimes referred to as Visionary personalities because of their passion for new, 
                    innovative ideas.""");
        } else if (Arrays.equals(result, enfj)) {
            System.out.println("""
                    The ENFJ Personality Type
                    ENFJs are idealist organizers, driven to implement their vision of what is best for humanity. They often act as catalysts for human growth because 
                    of their ability to see potential in other people 
                    and their charisma in persuading others to their ideas. They are focused on values and vision, and are passionate about the possibilities for people.
                                        
                    ENFJs are typically energetic and driven, and often have a lot on their plates. They are tuned into the needs of others and acutely aware of human 
                    suffering; however, they also tend to be optimistic and forward-thinking, intuitively seeing opportunity for improvement. The ENFJ is ambitious, 
                    but their ambition is not self-serving: rather, they feel personally responsible for making the world a better place.
                                   
                    What does ENFJ stand for?
                    ENFJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Extraverted, 
                    iIntuitive, Feeling, Judging. ENFJ indicates a person who is energized by time spent with others (Extraverted), who focuses on ideas and concepts 
                    rather than facts and details (iIntuitive), who makes decisions based on feelings and values (Feeling) and who prefers to be planned and organized 
                    rather than spontaneous and flexible (Judging). ENFJs are sometimes referred to as Teacher personalities because of their interest in helping others 
                    develop and grow.""");
        } else if (Arrays.equals(result, isfj)) {
            System.out.println("""
                    The ISFJ Personality Type
                    ISFJs are industrious caretakers, loyal to traditions and organizations. They are practical, compassionate, and caring, and are motivated to provide 
                    for others and protect them from the perils of life.
                                        
                    ISFJs are conventional and grounded, and enjoy contributing to established structures of society. They are steady and committed workers with a deep 
                    sense of responsibility to others. They focus on fulfilling their duties, particularly when they are taking care of the needs of other people. 
                    They want others to know that they are reliable and can be trusted to do what is expected of them. They are conscientious and methodical, 
                    and persist until the job is done.
                                        
                    What does ISFJ stand for?
                    ISFJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Introverted, 
                    Sensing, Feeling, Judging. ISFJ indicates a person who is energized by time spent alone (Introverted), who focuses on facts and details rather than 
                    ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) and who prefers to be planned and organized rather than 
                    spontaneous and flexible (Judging). ISFJs are sometimes referred to as Protector personalities because of their interest in keeping people safe and 
                    well cared for.
                                        
                    """);
        } else if (Arrays.equals(result, isfp)) {
            System.out.println("""
                    The ISFP Personality Type
                    ISFPs are gentle caretakers who live in the present moment and enjoy their surroundings with cheerful, low-key enthusiasm. They are flexible and spontaneous, 
                    and like to go with the flow to enjoy what life has to offer. ISFPs are quiet and unassuming, and may be hard to get to know. However, 
                    to those who know them well, the ISFP is warm and friendly, eager to share in life's many experiences.
                                        
                    ISFPs have a strong aesthetic sense and seek out beauty in their surroundings. They are attuned to sensory experience, and often have a natural talent for the arts. 
                    ISFPs especially excel at manipulating objects, and may wield creative tools like paintbrushes and sculptor's knives with great mastery.
                                        
                    What does ISFP stand for?
                    ISFP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Introverted, Sensing, Feeling, 
                    Perceiving. 
                    ISFP indicates a person who is energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), 
                    who makes decisions based on feelings and values (Feeling) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). 
                    ISFPs are sometimes referred to as Composer personalities because of their innate sensibility for creating aesthetically pleasing experiences.""");
        } else if (Arrays.equals(result, istj)) {
            System.out.println("""
                    The ISTJ Personality Type
                    ISTJs are responsible organizers, driven to create and enforce order within systems and institutions. They are neat and orderly, inside and out, 
                    and tend to have a procedure for everything they do. Reliable and dutiful, ISTJs want to uphold tradition and follow regulations.
                                        
                    ISTJs are steady, productive contributors. Although they are Introverted, ISTJs are rarely isolated; typical ISTJs know just where they belong in life, 
                    and want to understand how they can participate in established organizations and systems. They concern themselves with maintaining the social order and making sure 
                    that standards are met.
                                        
                    What does ISTJ stand for?
                    ISTJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Introverted, Sensing, Thinking, Judging. 
                    ISTJ indicates a person who is energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), 
                    who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). 
                    ISTJs are sometimes referred to as Inspector personalities because of their focus on details and interest in doing things correctly.""");
        } else if (Arrays.equals(result, istp)) {
            System.out.println("""
                    The ISTP Personality Type
                    ISTPs are observant artisans with an understanding of mechanics and an interest in troubleshooting. They approach their environments with a flexible logic, 
                    looking for practical solutions to the problems at hand. They are independent and adaptable, and typically interact with the world around them in a self-directed, 
                    spontaneous manner.
                                        
                    ISTPs are attentive to details and responsive to the demands of the world around them. Because of their astute sense of their environment, 
                    they are good at moving quickly and responding to emergencies. ISTPs are reserved, but not withdrawn: the ISTP enjoys taking action, 
                    and approaches the world with a keen appreciation for the physical and sensory experiences it has to offer.
                                        
                    What does ISTP stand for?
                    ISTP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Introverted, 
                    Sensing, Thinking, Perceiving. ISTP indicates a person who is energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), 
                    who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). 
                    ISTPs are sometimes referred to as Crafts person personalities because they typically have an innate mechanical ability and facility with tools.""");
        } else if (Arrays.equals(result, esfj)) {
            System.out.println("""
                    The ESFJ Personality Type
                    ESFJs are conscientious helpers, sensitive to the needs of others and energetically dedicated to their responsibilities. They are highly attuned to their emotional environment 
                    and attentive to both the feelings of others and the perception others have of them. ESFJs like a sense of harmony and cooperation around them, 
                    and are eager to please and provide.
                                        
                    ESFJs value loyalty and tradition, and usually make their family and friends their top priority. They are generous with their time, effort, and emotions. 
                    They often take on the concerns of others as if they were their own, and will attempt to put their significant organizational talents to use to bring order to other people's lives.
                                        
                    What does ESFJ stand for?
                    ESFJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Extraverted, Sensing, Feeling, Judging. 
                    ESFJ indicates a person who is energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), 
                    who makes decisions based on feelings and values (Feeling) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). 
                    ESFJs are sometimes referred to as Provider personalities because of their interest in taking care of others in practical ways.""");
        } else if (Arrays.equals(result, esfp)) {
            System.out.println("""
                    The ESFP Personality Type
                    ESFPs are vivacious entertainers who charm and engage those around them. They are spontaneous, energetic, and fun-loving, and take pleasure in the things around them: 
                    food, clothes, nature, animals, and especially people.
                                        
                    ESFPs are typically warm and talkative and have a contagious enthusiasm for life. They like to be in the middle of the action and the center of attention. 
                    They have a playful, open sense of humor, and like to draw out other people and help them have a good time.
                                        
                    What does ESFP stand for?
                    ESFP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Extraverted, Sensing, Feeling, Perceiving. 
                    ESFP indicates a person who is energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), 
                    who makes decisions based on feelings and values (Feeling) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). 
                    ESFPs are sometimes referred to as Performer personalities because of their playful, energetic nature.""");
        } else if (Arrays.equals(result, estj)) {
            System.out.println("""
                    The ESTJ Personality Type
                    ESTJs are hardworking traditionalists, eager to take charge in organizing projects and people. Orderly, rule-abiding, and conscientious, ESTJs like to get things done, 
                    and tend to go about projects in a systematic, methodical way.
                                        
                    ESTJs are the consummate organizers, and want to bring structure to their surroundings. They value predictability and prefer things to proceed in a logical order. 
                    When they see a lack of organization, the ESTJ often takes the initiative to establish processes and guidelines, so that everyone knows what's expected.
                                        
                    What does ESTJ stand for?
                    ESTJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Extraverted, Sensing, Thinking, Judging. 
                    ESTJ indicates a person who is energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), 
                    who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). 
                    ESTJs are sometimes referred to as Supervisor personalities because they tend to take charge and make sure things are done correctly.""");
        } else if (Arrays.equals(result, estp)) {
            System.out.println("""
                    The ESTP Personality Type
                    ESTPs are energetic thrill seekers who are at their best when putting out fires, whether literal or metaphorical. They bring a sense of dynamic energy to their interactions with others 
                    and the world around them. They assess situations quickly and move adeptly to respond to immediate problems with practical solutions.
                                        
                    Active and playful, ESTPs are often the life of the party and have a good sense of humor. They use their keen powers of observation to assess their audience and 
                    adapt quickly to keep interactions exciting. Although they typically appear very social, they are rarely sensitive; the ESTP prefers to keep things fast-paced and silly rather than emotional or serious.
                                        
                    What does ESTP stand for?
                    ESTP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for Extraverted, Sensing, Thinking, Perceiving. 
                    ESTP indicates a person who is energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), 
                    who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). 
                    ESTPs are sometimes referred to as Dynamo personalities because of their high-energy, active approach to life.""");
        }
    }

    public static String placeCheckmark(int num, int position){
            return (num == 1 && position == 1) || (num == 0 && position == 2) ? String.format("%c", '\u2713') : "";
        }

        public static void iterate(String[] questions, int[] answers) {
            //loop through string array
            //print questions numbers, print questions print options, and save answers to
            // the second integer array

            Scanner scanner = new Scanner(System.in);
            String optionAorB;
            for (int number = 0; number < questions.length; number++) {
                System.out.printf("Question %d%n", questionNumber++);
                System.out.println(questions[number]);
                System.out.println("Pick an option: A or B");
                optionAorB = getOption(scanner);
                if ((optionAorB.equalsIgnoreCase("A"))){
                    answers[number] = 1;
                }
            }
        }

        public static int sum(int[] intArrays){
            int sum = 0;
            for(int number : intArrays) sum += number;
            return sum;
        }


        public static int countNumbers(int[] numArray, int number){
            int count = 0;
            for(int num : numArray){
                if(num == number) count++;
            }
            return count;
        }

        public static String getOption(Scanner input){
            String option;
            while (true){
                try {
                    option = input.nextLine();
                    if(option.trim().equalsIgnoreCase("A".trim()) || option.trim().equalsIgnoreCase("B".trim())){
                        return option;
                    }else {
                        throw new IllegalArgumentException("Wrong choice; choose A or B");
                    }
                }catch (IllegalArgumentException ex){
                    System.err.println(ex.getMessage());
                }
            }
        }
}
