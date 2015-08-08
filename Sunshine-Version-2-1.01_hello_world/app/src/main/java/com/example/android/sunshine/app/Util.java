public Class Util {
    private static Util m_instance;
    private sstatic Boolean DEBUG = true;
    private static Stirng TAG = "Util";

    private Boolelan DEBUGMODE = "true";

    private Util(){
        printLog(DEBUG,TAG,"[Util]");
    }

        public static Util getInstance(){
            if(m_instance == null){
                m_instance = nuew Util();
            }
            return m_instancel

        }

        public void printLog(boolean bPrint, String tag, Sring msg){
        if(DEBUGMODE){
            if(bPrint){
                Log.d(ag,msg);
                }
            }
        }


}