'use strict';

angular.module('acessoApp').factory('PessoaService',
    ['$localStorage', '$http', '$q', 'urls',
        function ($localStorage, $http, $q, urls) {

            var factory = {
                loadAllPessoas: loadAllPessoas,
                getAllPessoas: getAllPessoas
            };

            return factory;

            function loadAllPessoas() {
                console.log('Fetching all acess');
                var deferred = $q.defer();
                $http.get(urls.PESSOA_SERVICE_API)
                    .then(
                        function (response) {
                            console.log('Fetched successfully all persons');
                            $localStorage.pessoas = response.data;
                            deferred.resolve(response);
                        },
                        function (errResponse) {
                            console.error('Error while loading persons');
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

            function getAllPessoas(){
                return $localStorage.pessoas;
            }
            
            function getPessoa(cpf) {
                console.log('Fetching User with cpf0 :'+cpf);
                var deferred = $q.defer();
                $http.get(urls.USER_SERVICE_API + cpf)
                    .then(
                        function (response) {
                            console.log('Fetched successfully User with id :'+cpf);
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while loading user with id :'+cpf);
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
 
            function createPessoa(pessoa) {
                console.log('Creating User');
                var deferred = $q.defer();
                $http.post(urls.PESSOA_SERVICE_API, pessoa)
                    .then(
                        function (response) {
                            loadAllPessoas();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                           console.error('Error while creating User : '+errResponse.data.errorMessage);
                           deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
 
            function updatePessoa(pessoa, cpf) {
                console.log('Updating User with cpf '+cpf);
                var deferred = $q.defer();
                $http.put(urls.PESSOA_SERVICE_API + cpf, pessoa)
                    .then(
                        function (response) {
                            loadAllPessoas();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while updating User with cpf :'+cpf);
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
 
            function removePessoa(cpf) {
                console.log('Removing User with cpf '+cpf);
                var deferred = $q.defer();
                $http.delete(urls.PESSOA_SERVICE_API + cpf)
                    .then(
                        function (response) {
                            loadAllPessoas();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while removing User with cpf :'+cpf);
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
        }
    ]);