package ClasesYObjetos;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour,int minute,int second)
    {

        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }
    public void SetTime(int hour,int minute,int second )
    {

        System.out.println("Hora: "+hour);
        System.out.println("Minutos: "+minute);
        System.out.println("Segundo: "+second);

    }


    public void addHour(int hour)
    {

        this.hour=this.hour+hour;

    }
    public void addMinute(int minute)
    {
        this.minute=this.minute+minute;

    }
    public void addSecond(int second)
    {
        this.second=this.second+second;
    }



    public int getHour()
    {

        int auxHo=hour;
        if(hour>24)
        {

            if(hour%24==0)
            {
                hour=0;


            }else
            {
                while (auxHo>24)
                {
                    auxHo=auxHo-24;
                }
                if(auxHo==24)
                {
                    addHour(1);

                }else
                {
                    addHour(auxHo);
                }

            }


        }
        return (hour);


    }

    public int getMinute()
    {
        int auxMinute=minute;
        if(minute>60)
        {

            if(minute%60==0)
            {
                addHour(minute/60);
                minute=0;



            }else
            {
                while (minute>60)
                {
                    auxMinute=minute-60;
                    addHour(1);




                }
                if(auxMinute==60)
                {
                    addHour(1);

                }else
                {
                    addHour(auxMinute);
                }

            }


        }
        return minute;



    }

    public int getSecond()
    {
        int auxSecond=second;
        if(second>60)
        {

            if(second%60==0)
            {
                addMinute(second/60);
                second=0;



            }else
            {
                while (second>60)
                {
                    auxSecond=second-60;
                    addMinute(1);



                }
                if(auxSecond==60)
                {
                    addSecond(1);

                }else
                {
                    addSecond(auxSecond);
                }

            }


        }

        return second;
    }
    public void Imprimir()
    {
        System.out.println("Hora "+hour);
        System.out.println("Minutos"+minute);
        System.out.println("Segunodos"+second);



    }
}



